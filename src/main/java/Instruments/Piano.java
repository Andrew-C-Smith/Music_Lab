package Instruments;

import Behaviours.IPlay;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String name, String material, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(name, material, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String play() {
        return "That is some top Mozart shit!";
    }

    public int getNumberOfKeys(){
        return numberOfKeys;
    }
}
