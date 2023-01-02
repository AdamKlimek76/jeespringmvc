package pl.coderslab;

public class CartItem {

    private int quantity;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
