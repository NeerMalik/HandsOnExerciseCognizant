public class Main {

    public static void main(String[] args) {

       Product[] products = {
                new Product(104, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(102, "Phone", "Electronics")
        };

       Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Keyboard", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        int targetId = 103;

        Product linearResult =
                SearchOperations.linearSearch(products, targetId);

        Product binaryResult =
                SearchOperations.binarySearch(sortedProducts, targetId);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        System.out.println("Binary Search Result:");
        System.out.println(binaryResult);
    }
}