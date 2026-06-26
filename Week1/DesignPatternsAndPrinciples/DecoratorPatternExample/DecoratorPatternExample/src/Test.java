//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
    Notifier notifier=new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
    notifier.send("Your order has been shipped");
    }
}