package shopPackage;

import shopPackage.model.Deal;

public class MockRepository {
    public static Deal getHighVolumeOrderDeal() {
        return new Deal(
                "You Are A Great Customer Discount!",
                0.05
        );
    }

    public static Deal getSummerDeal() {
        return new Deal(
                "Letnia Promocja!",
                0.15
        );
    }
}
