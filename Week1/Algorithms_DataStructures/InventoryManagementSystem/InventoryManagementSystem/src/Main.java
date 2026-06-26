import java.util.*;

public class Main {
    public static void main(String[] args) {
    InventoryManager manager=new InventoryManager();
        manager.addProduct(new Product(101, "Laptop", 20, 55000));
        manager.addProduct(new Product(102, "Keyboard", 50, 1200));
        manager.addProduct(new Product(103, "Mouse", 100, 700));
        manager.displayProducts();

        manager.updateProduct(102, 60, 1300);

        manager.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");

        manager.displayProducts();
    }
}