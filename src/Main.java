import shop.Basket;
import shop.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Basket basket = new ShoppingCart();

        basket.addProduct("Apple", 3);
        basket.addProduct("Banana", 2);
        basket.addProduct("Apple", 1);

        System.out.println("Products in the basket: " + basket.getProducts());
        System.out.println("Quantity of Apples: " + basket.getProductQuantity("Apple"));

        basket.removeProduct("Banana");
        System.out.println("Products in the basket after removing Banana: " + basket.getProducts());

        basket.updateProductQuantity("Apple", 5);
        System.out.println("Quantity of Apples after updating: " + basket.getProductQuantity("Apple"));

        basket.clear();
        System.out.println("Products in the basket after clearing: " + basket.getProducts());
    }
}
