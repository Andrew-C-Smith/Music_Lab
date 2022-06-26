package Shop;

import Behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShopTest {


    Shop shop;

    ProductType productType;
    Stock product1;
    Stock product2;
    Stock product3;
    Stock product4;
    ArrayList<ISell> stock;

    @Before
    public void before(){
        product1 = new Stock(ProductType.GUITAR_STRINGS);
        product2 = new Stock(ProductType.DRUM_STICKS);
        product3 = new Stock(ProductType.MUSIC_SHEETS);
        product4 = new Stock(ProductType.GUITAR_STRINGS);
        stock = new ArrayList<>();
        stock.add(product1);
        shop = new Shop("Rays Music Exchange", stock);
    }


    @Test
    public void hasStock() {
        assertEquals(1, shop.stockCount() );
    }


    @Test
    public void canGetShopName() {
        assertEquals("Rays Music Exchange", shop.getShopName());
    }

    @Test
    public void canAddStock() {
        stock.add(product2);
        stock.add(product4);
        assertEquals(3, shop.stockCount() );

    }

    @Test
    public void canRemoveStock() {
        stock.remove(product1);
        assertEquals(0, shop.stockCount() );
    }

    @Test
    public void stockCount() {
        assertEquals(1, shop.stockCount() );
    }

    @Test
    public void getProductBoughtPrice() {
        assertEquals(2, product1.buyingPrice());
    }

    @Test
    public void getProductSellPrice() {
    }

    @Test
    public void getProductDescription() {
    }
}