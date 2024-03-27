package by.itstep.goutor.shopoopproject.model.data;

public class Milk {
    private double volume;
    private double fat;
    private double price;

    public Milk() {
    }

    public Milk(double volume, double fat, double price) {
        this.volume = volume;
        this.fat = fat;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    public double getPrice() {
        return price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
