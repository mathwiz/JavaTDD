package headfirst.combined.djview;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        this.view = new DJView(this, new HeartAdapter(model));
        this.view.createView();
        this.view.createControls();
        this.view.disableStopMenuItem();
        this.view.disableStartMenuItem();
    }

    @Override
    public void start() {
        System.out.println("HeartController start");
    }

    @Override
    public void stop() {
        System.out.println("HeartController stop");

    }

    @Override
    public void increaseBPM() {
        System.out.println("HeartController increaseBPM");

    }

    @Override
    public void decreaseBPM() {
        System.out.println("HeartController decreaseBPM");

    }

    @Override
    public void setBPM(int bpm) {
        System.out.println("HeartController setBPM");

    }
}
