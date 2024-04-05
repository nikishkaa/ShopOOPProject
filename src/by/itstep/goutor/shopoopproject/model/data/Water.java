package by.itstep.goutor.shopoopproject.model.data;

public class Water {
    private double price;

    public Water() {
    }

    public Water(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Water{" +
                "price=" + price +
                '}';
    }
}
