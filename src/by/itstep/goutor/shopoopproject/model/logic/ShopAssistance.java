package by.itstep.goutor.shopoopproject.model.logic;

import by.itstep.goutor.shopoopproject.model.data.Product;
import by.itstep.goutor.shopoopproject.model.data.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || basket.getSize() == 0) {
            return -1;
        }

        double total = 0;
        for (Product product : basket.getProducts()) {
            total += product.getPrice();
        }

        return total;
    }
}
