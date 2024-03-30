package by.itstep.goutor.shopoopproject.model.logic;

import by.itstep.goutor.shopoopproject.model.data.Bread;
import by.itstep.goutor.shopoopproject.model.data.Milk;
import by.itstep.goutor.shopoopproject.model.data.Orange;
import by.itstep.goutor.shopoopproject.model.data.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || (basket.getSizeBread() == 0
                && basket.getSizeMilk() == 0
                && basket.getSizeOrange() == 0)) {
            return -1;
        }

        double total = 0;

        for (Orange orange : basket.getOranges()) {
            total += orange.getCost();
        }

        for (Milk milk : basket.getMilks()) {
            total += milk.getPrice();
        }

        for (Bread bread : basket.getBreads()) {
            total += bread.getPrice();
        }

        return total;
    }
}
