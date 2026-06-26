public class Order {
    public int orderId;
    public String customerName;
    public int totalPrice;
    public Order(int orderId,String customerName,int totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }
    public String toString() {
        return "Product ID: " + orderId +
                ", Name: " + customerName +
                ", Category: " + totalPrice;
    }

}
