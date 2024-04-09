package by.itstep.goutor.shopoopproject.model.data.container;

import by.itstep.goutor.shopoopproject.model.data.Product;

import java.util.Arrays;

public class Basket {
    private Product[] products;




    public Basket() {
        products = new Product[0];
    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public void add(Product product) {

    }

    public void remove(Product product) {

    }

    public void remove(int index) {

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getSize() {
        return products.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products: \n");

        for (int i = 0; i < products.length; i++) {
            builder.append(products[i]).append("\n");
        }
        return builder.toString();
    }
}
