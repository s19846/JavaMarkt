package shopPackage.model;

public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(
            String code,
            String name,
            double price,
            double discountPrice
    ) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public double getPrice() {
        return price;
    }
}
