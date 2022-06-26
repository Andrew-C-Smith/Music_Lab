package Shop;

import Behaviours.ISell;

public class Stock implements ISell {

    private ProductType productType;

    public Stock(ProductType productType) {
        this.productType = productType;
    }

    public ProductType getProductType() {
        return productType;
    }

    @Override
    public double buyingPrice() {
        return 0;
    }

    @Override
    public double sellingPrice() {
        return 0;
    }

    @Override
    public double calculateMarkUp() {
        return 0;
    }
}
