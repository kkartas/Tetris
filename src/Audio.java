package tetris;

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Audio {
    public  static void PlayAudio() {

            try {

                Sequence sequence = MidiSystem.getSequence(new File("audio/sound.mid"));
                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();
                sequencer.setSequence(sequence);
                sequencer.setLoopCount(100);
                sequencer.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}