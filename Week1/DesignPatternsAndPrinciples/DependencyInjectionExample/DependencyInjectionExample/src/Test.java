//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {


        CustomerRepository repository =
                new CustomerRepositoryImpl();


        CustomerService service =
                new CustomerService(repository);

        Customer customer = service.getCustomer(101);

        if (customer != null) {
            System.out.println("Customer Found");
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
        } else {
            System.out.println("Customer not found");
        }
    }
}