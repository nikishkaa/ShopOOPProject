package by.itstep.goutor.shopoopproject.model.data.container;

import by.itstep.goutor.shopoopproject.model.data.Bread;
import by.itstep.goutor.shopoopproject.model.data.Milk;
import by.itstep.goutor.shopoopproject.model.data.Orange;

public class Basket {
    public static final int DEFAULT_SIZE = 10;
    private Orange[] oranges;
    private Milk[] milks;
    private Bread[] breads;

    public Basket() {
        oranges = new Orange[DEFAULT_SIZE];
        milks = new Milk[DEFAULT_SIZE];
        breads = new Bread[DEFAULT_SIZE];
    }

    public Basket(Orange[] oranges, Milk[] milks, Bread[] breads) {
        this.oranges = oranges;
        this.milks = milks;
        this.breads = breads;
    }

    public Orange[] getOranges() {
        return oranges;
    }

    public Milk[] getMilks() {
        return milks;
    }

    public Bread[] getBreads() {
        return breads;
    }

    public void setOranges(Orange[] oranges) {
        this.oranges = oranges;
    }

    public void setMilks(Milk[] milks) {
        this.milks = milks;
    }

    public void setBreads(Bread[] breads) {
        this.breads = breads;
    }
}
