package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Big Piano", "granite", "luminous", InstrumentType.KEYBOARD, 88);
    }

    @Test
    public void play() {
        assertEquals("That is some top Mozart shit!", piano.play());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}