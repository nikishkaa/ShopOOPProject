package by.itstep.goutor.shopoopproject.model.data;

public class Water extends Product {

    public Water() {
    }

    public Water(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Water{" +
                "price = " + super.toString() + '}';
    }
}
