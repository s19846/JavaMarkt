package shopPackage.model;

import shopPackage.Main;
import shopPackage.MockRepository;

import java.util.ArrayList;

public class Basket {
    private ArrayList<BasketItem> items = new ArrayList<>();
    private ArrayList<Deal> deals = new ArrayList<>();

    private double basketSum = 0;

    public Basket addProduct(Product product) {
        this.items.add(new BasketItem(product));
        this.basketSum += product.getPrice();

        return this;
    }

    public double getBasketSum() {
        return this.basketSum;
    }

    public double getFinalPrice() {
        return this.getBasketSum() * (1 - this.getDiscount());
    }

    public double getDiscount() {
        double currentDiscountValue = 0;
        for (Deal currentDeal : deals) {
            currentDiscountValue += currentDeal.getDiscountValue();
        }
        return currentDiscountValue;
    }

    public Basket applyDiscountCode(String discountCode) {
        if (discountCode.equals("IdzieLato")) {
            Deal summerDeal = MockRepository.getSummerDeal();
            this.addDeal(summerDeal);
        }
        return this;
    }

    public Basket addDeal(Deal deal) {
        for (Deal currentDeal : deals) {
            if (currentDeal.equals(deal)) {
                return this;
            }
        }
        deals.add(deal);
        return this;
    }
}
