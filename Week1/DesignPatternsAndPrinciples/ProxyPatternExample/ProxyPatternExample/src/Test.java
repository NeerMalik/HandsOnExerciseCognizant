//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        Image image=new ProxyImage("nature.jpg");
        System.out.println("First display:");
        image.display();
        System.out.println("Second display");
        image.display();
    }
}