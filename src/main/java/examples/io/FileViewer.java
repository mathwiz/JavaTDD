package examples.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Yohan on 1/18/14.
 */
public class FileViewer extends Frame implements ActionListener {

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

    public FileViewer(String filename) {
        super();
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
        Button close = new Button("Close");
        openfile.addActionListener(this);
        openfile.setActionCommand("open");
        openfile.setFont(SANS_SERIF);
        close.addActionListener(this);
        close.setActionCommand("close");
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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand();
        if (cmd.equals("open")) {
            FileDialog f = new FileDialog(this, "Open File", FileDialog.LOAD);
            f.setDirectory(directory);
            f.show();
            directory = f.getDirectory();
            setFile(directory, f.getFile());
            f.dispose();
        } else if (cmd.equals("close")) {
            this.dispose();
        }
    }

    private void setFile(String directory, String file) {
        if (file == null || file.length() == 0) return;
        FileReader in = null;
        try {
            in = new FileReader(new File(directory, file));
            char[] buffer = new char[4096];
            textarea.setText("");
            int len = in.read(buffer);
            while (len != -1) {
                textarea.append(new String(buffer, 0, len));
                len = in.read(buffer);
            }
            this.setTitle("FileViewer: " + file);
            textarea.setCaretPosition(0);
        } catch (IOException e) {
            textarea.setText(e.getClass().getName() + " " + e.getMessage());
            this.setTitle(file + ": IOException");
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                System.out.println("Fatal error: " + e);
            }
        }
    }
}
