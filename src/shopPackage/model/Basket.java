package shopPackage.model;

import java.util.ArrayList;

public class Basket {
    ArrayList<BasketItem> items = new ArrayList<>();
    public static final double discountPricePoint = 300;
    public static final int highVolumeDiscountValue = 5;

    private double basketSum = 0;
    private double finalPrice = 0;
    private int discount = 0;

    public Basket addProduct(Product product) {
        items.add(new BasketItem(product));
        this.basketSum += product.getPrice();

        return this;
    }

    public double getBasketSum() {
        return this.basketSum;
    }

    public double getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
