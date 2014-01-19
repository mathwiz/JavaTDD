package examples.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * Created by Yohan on 1/18/14.
 */
public class FileViewer extends Frame {
    public static final Font MONO_SPACED = new Font("MonoSpaced", Font.PLAIN, 12);

    public static void main(String[] args) {
        Frame f = new FileViewer(args.length == 1 ? args[0] : null);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent windowEvent) {
                super.windowClosed(windowEvent);
                System.exit(0);
            }
        });
        f.show();
    }

    private TextArea textarea;
    private String directory;
    private final Frame me;

    public FileViewer(String filename) {
        super();
        me = this;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                dispose();
            }
        });

        textarea = new TextArea("", 24, 90);
        textarea.setFont(MONO_SPACED);
        textarea.setEditable(false);
        this.add("Center", textarea);

        Panel p = new Panel();
        p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        this.add(p, "South");

        Button openfile = new Button("Open File");
        openfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FileDialog f = new FileDialog(me, "Open File", FileDialog.LOAD);
                f.setDirectory(directory);
                f.show();
                directory = f.getDirectory();
                setFile(directory, f.getFile());
                f.dispose();
            }
        });

        Button close = new Button("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });

        p.add(openfile);
        p.add(close);
        this.pack();

        File f = filename == null ? null : new File(filename);
        directory = f == null ? System.getProperty("user.dir") : f.getParent();
        setFile(directory, (f != null && f.isAbsolute()) ? f.getName() : filename);
    }

    private void setFile(String directory, String file) {
        if (file == null || file.length() == 0) return;
        TextFileHelper textFileHelper = null;
        try {
            File f = new File(directory, file);
            textFileHelper = new TextFileHelper(f);
            textarea.setText("");
            for (String line : textFileHelper.getLines()) {
                textarea.append(line + System.getProperty("line.separator"));
            }
            this.setTitle("FileViewer: " + f.getAbsolutePath());
            textarea.setCaretPosition(0);
        } catch (Exception e) {
            textarea.setText(e.getClass().getName() + " " + e.getMessage());
            this.setTitle(file + ": " + e);
        } finally {
            if (textFileHelper != null) textFileHelper.close();
        }
    }
}
