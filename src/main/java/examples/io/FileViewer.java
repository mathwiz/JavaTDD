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

    public static final Font SANS_SERIF = new Font("SansSerif", Font.BOLD, 14);
    public static final Font MONO_SPACED = new Font("MonoSpaced", Font.PLAIN, 11);

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

        textarea = new TextArea("", 24, 80);
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
        openfile.setFont(SANS_SERIF);

        Button close = new Button("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
        close.setFont(SANS_SERIF);

        p.add(openfile);
        p.add(close);
        this.pack();

        init(filename);
    }

    private void init(String filename) {
        File f = filename == null ? null : new File(filename);
        String directory = f == null ? System.getProperty("user.dir") : f.getParent();
        this.directory = directory;
        setFile(directory, (f != null && f.isAbsolute()) ? f.getName() : filename);
    }

    private void setFile(String directory, String file) {
        if (file == null || file.length() == 0) return;
        TextFileHelper reader = null;
        try {
            reader = new TextFileHelper(new File(directory, file));
            textarea.setText("");
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                textarea.append(line + System.getProperty("line.separator"));
            }
            this.setTitle("FileViewer: " + file);
            textarea.setCaretPosition(0);
        } catch (Exception e) {
            textarea.setText(e.getClass().getName() + " " + e.getMessage());
            this.setTitle(file + ": " + e);
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (Exception e) {
                System.out.println("Fatal error: " + e);
            }
        }
    }
}
