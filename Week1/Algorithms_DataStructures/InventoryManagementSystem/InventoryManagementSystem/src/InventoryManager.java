import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer,Product> inventory=new HashMap<>();
    public void addProduct(Product product){
        inventory.put(product.getProductId(),product);
        System.out.println("Product successfully added");
    }
    public void updateProduct(int productId,int quantity,double price){
        Product product=inventory.get(productId);
        if(product!=null){
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated successfully");
        }else{
            System.out.println("Product not found");
        }
    }
    public void deleteProduct(int productId){
        if(inventory.remove(productId)!=null){
            System.out.println("Product remomved");
        }
        else{
            System.out.println("Product not found");
        }
    }
    public void displayProducts(){
        for(Product product: inventory.values()){
            System.out.println(product);
        }
    }
}
