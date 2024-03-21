package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket {

    private final Map<String, Integer> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        int currentQuantity = products.getOrDefault(product, 0);
        products.put(product, currentQuantity + quantity);
        System.out.println(quantity + " " + product + "(s) added to the basket.");
    }

    @Override
    public void removeProduct(String product) {
        if (products.containsKey(product)) {
            products.remove(product);
            System.out.println(product + " removed from the basket.");
        } else {
            System.out.println("Product not found in the basket.");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
            System.out.println("Quantity of " + product + " updated to " + quantity + ".");
        } else {
            System.out.println("Product not found in the basket.");
        }
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Basket cleared.");
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
