package by.itstep.goutor.shopoopproject.model.logic;

import by.itstep.goutor.shopoopproject.model.data.Bread;
import by.itstep.goutor.shopoopproject.model.data.Milk;
import by.itstep.goutor.shopoopproject.model.data.Orange;
import by.itstep.goutor.shopoopproject.model.data.container.Basket;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPricePositive() {
        Milk[] milks = {new Milk(1000, 3.5, 2)};
        Bread[] breads = {new Bread("Black", "first", 1.5)};
        Orange[] oranges = {new Orange(100, 3000, 0.5)};

        Basket basket = new Basket(oranges, milks, breads);

        double expected = 4;


        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPricePositiveByNull() {
        Basket basket = null;
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalPricePositiveByEmptyBasket() {
        Basket basket = new Basket();
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }
}
