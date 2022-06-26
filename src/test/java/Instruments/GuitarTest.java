package Instruments;

import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){guitar = new Guitar("My AXE!", "Wood", "Black and Gold", InstrumentType.STRINGS, 6);

    };

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasName(){
        assertEquals("My AXE!", guitar.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black and Gold", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }
    @Test
    public void canPlay(){
        assertEquals("Shredding it", guitar.play());
    }

}