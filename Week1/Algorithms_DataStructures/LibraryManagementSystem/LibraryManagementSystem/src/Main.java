public class Main {

    public static void main(String[] args) {


        Book[] books = {
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(101, "Java Programming", "James Gosling"),
                new Book(105, "Operating Systems", "Abraham Silberschatz"),
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(104, "Database Systems", "Henry Korth")
        };


        Book[] sortedBooks = {
                new Book(102, "Computer Networks", "Andrew Tanenbaum"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Database Systems", "Henry Korth"),
                new Book(101, "Java Programming", "James Gosling"),
                new Book(105, "Operating Systems", "Abraham Silberschatz")
        };

        String targetTitle = "Java Programming";

        Book linearResult =
                SearchOperations.linearSearch(books, targetTitle);

        Book binaryResult =
                SearchOperations.binarySearch(sortedBooks, targetTitle);

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        System.out.println("Binary Search Result:");
        System.out.println(binaryResult);
    }
}