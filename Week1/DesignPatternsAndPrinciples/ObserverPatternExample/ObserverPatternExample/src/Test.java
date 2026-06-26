public class Test {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Neer");
        Observer webUser = new WebApp("Rahul");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("XYZ", 3750.50);

        System.out.println();

        stockMarket.deregisterObserver(webUser);

        stockMarket.setStockPrice("XYZ", 3800.75);
    }
}