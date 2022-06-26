package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop implements ISell{
    private ArrayList<ISell> stock;
    private String shopName;

    private ProductType productType;

    public Shop( String shopName,ArrayList<ISell> stock) {
        this.stock = stock;
        this.shopName = shopName;
//        this.productType = productType;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public String getShopName() {
        return shopName;
    }

    public void addStock(ISell product){
        stock.add(product);
    }
    public void removeStock(ISell product){
        stock.remove(product);
    }

    public int stockCount(){
        return stock.size();
    }

    public double getProductBoughtPrice(){
        return this.productType.getBoughtPrice();
    }

    public double getProductSellPrice(){
        return this.productType.getSellPrice();
    }

    public String getProductDescription(){
        return this.productType.getDescription();
    }

    @Override
    public double buyingPrice() {
        return this.productType.getBoughtPrice();
    }

    @Override
    public double sellingPrice() {
        return this.productType.getSellPrice();
    }

    @Override
    public double calculateMarkUp() {
        return this.productType.getSellPrice() - this.productType.getBoughtPrice();
    }
}
