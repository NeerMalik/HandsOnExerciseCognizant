public class CustomerRepositoryImpl implements CustomerRepository {


    public Customer findCustomerById(int id) {


        if (id == 101) {
            return new Customer(101, "ABC");
        }

        return null;
    }
}