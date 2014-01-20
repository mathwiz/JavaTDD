package headfirst.combined.djview;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = (int)(getValue() * .75);
            System.out.println("Beat bar read value and scaled to " + value);
            setValue(value);
            repaint();
            try {
                Thread.sleep(250);
            } catch (Exception e) {};
        }
    }
}
