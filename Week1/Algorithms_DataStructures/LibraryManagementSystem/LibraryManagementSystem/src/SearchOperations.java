public class SearchOperations {


    public static Book linearSearch(Book[] books, String targetTitle) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }

        return null;
    }


    public static Book binarySearch(Book[] books, String targetTitle) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}