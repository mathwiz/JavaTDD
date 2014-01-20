package headfirst.combined.djview;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Sequence sequence;
    Track track;

    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    public void on() {
        System.out.println("BeatModel on");
        sequencer.start();
        setBPM(getBPM());
    }

    @Override
    public void registerObserver(BeatObserver o) {
        System.out.println("Registering BeatObserver " + o);
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        System.out.println("Removing BeatObserver " + o);
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        System.out.println("Registering BPMObserver " + o);
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        System.out.println("Removing BPMObserver " + o);
        bpmObservers.remove(o);
    }

    @Override
    public void meta(MetaMessage metaMessage) {
        if (metaMessage.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    @Override
    public void off() {
        System.out.println("BeatModel off");
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    public void beatEvent() {
        notifyBeatObservers();
    }

    public void notifyBeatObservers() {
        for (BeatObserver it : beatObservers) {
            it.updateBeat();
        }
    }

    public void notifyBPMObservers() {
        for (BPMObserver it : bpmObservers) {
            it.updateBPM();
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int it = list[i];
            if (it != 0) {
                track.add(makeEvent(144, 9, it, 100, i));
                track.add(makeEvent(128, 9, it, 100, i + 1));
            }
        }
    }

    public MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {
        System.out.println(String.format("Making MidiEvent cmd(%d) chan(%d) one(%d) two(%d) tick(%d)", cmd, chan, one, two, tick));
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
