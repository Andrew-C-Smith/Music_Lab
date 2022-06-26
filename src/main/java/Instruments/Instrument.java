package Instruments;

import Behaviours.IPlay;


public abstract class Instrument implements IPlay {

    private String name;
    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(String name, String material, String colour, InstrumentType instrumentType) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getName(){
        return this.name;
    }

    public String getMaterial(){
        return this.material;
    }

    public String getColour(){
        return this.colour;
    }

    public InstrumentType getInstrumentType(){
        return this.instrumentType;
    }
}
