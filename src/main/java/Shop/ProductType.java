package Shop;

public enum ProductType {

    GUITAR_STRINGS("Guitar Strings",2,3),
    MUSIC_SHEETS("Music Sheets",4,6),
    DRUM_STICKS("Drum Sticks",5,8);

    private String description;
    private double boughtPrice;
    private double sellPrice;

    ProductType(String description, double boughtPrice, double sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
