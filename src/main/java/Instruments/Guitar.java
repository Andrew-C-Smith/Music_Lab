package Instruments;



public class Guitar  extends Instrument{

    private int numberOfStrings;

    public Guitar(String name, String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(name, material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Shredding it";
    }

}
