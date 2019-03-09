package shopPackage;

import java.util.ArrayList;
import shopPackage.model.*;

public class Main {

    private static ArrayList<Product> getSampleProducts(int n) {
        ArrayList<Product> sample = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Product product = new Product("Product " + i, Integer.toString(i * 25), 100, 100);
            sample.add(product);
        }
        return sample;
    }

    public static Basket getSampleBasket() {
        Basket basket = new Basket();
        for (Product product : getSampleProducts(10)) {
            basket.addProduct(product);
        }
        return basket;
    }

    /**
     * Final check before serving order to client
     * @param Basket currentBasket
     * @return Basket
     */
    public static Basket summarizeOrder(Basket currentBasket) {
        if (currentBasket.getBasketSum() > Basket.discountPricePoint) {
            currentBasket.setDiscount(Basket.highVolumeDiscountValue);
        }
        return currentBasket;
    }

    public static void buyLotsOfFunnyThings() {

    }

    public static void main(String[] args) {
        System.out.println("elo dżambo");
        Basket sampleBasket = getSampleBasket();
        System.out.println("mam koszyk");
        buyLotsOfFunnyThings();
    }
}
