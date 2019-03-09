package shopPackage.model;

public class Deal {
    private String name;
    private double discountValue;

    public Deal(
        String name,
        double discountValue
    ) {
        this.name = name;
        this.discountValue = discountValue;
    }

    public String getName() {
        return name;
    }

    public double getDiscountValue() {
        return discountValue;
    }
}
