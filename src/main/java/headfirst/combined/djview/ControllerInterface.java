package headfirst.combined.djview;

/**
 * Created by Yohan on 1/2/14.
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
