public class Main {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        Order[] orders2 = {
                new Order(101, "Aman", 3500),
                new Order(102, "Neha", 1200),
                new Order(103, "Rohan", 5600),
                new Order(104, "Priya", 2800)
        };

        System.out.println("Bubble Sort Result:");

        SortOperations.bubbleSort(orders1);
        SortOperations.displayOrders(orders1);

        System.out.println("\nQuick Sort Result:");

        SortOperations.quickSort(orders2, 0, orders2.length - 1);
        SortOperations.displayOrders(orders2);
    }
}