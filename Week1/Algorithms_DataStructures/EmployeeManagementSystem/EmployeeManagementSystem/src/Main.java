public class Main {

    public static void main(String[] args) {

        EmployeeManagement manager = new EmployeeManagement(5);

        manager.addEmployee(new Employee(101, "Aman", "Developer", 60000));
        manager.addEmployee(new Employee(102, "Neha", "Tester", 50000));
        manager.addEmployee(new Employee(103, "Rohan", "Manager", 80000));

        System.out.println("Employee Records:");
        manager.traverseEmployees();

        System.out.println("\nSearch Result:");

        Employee employee = manager.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee 102...");
        manager.deleteEmployee(102);

        System.out.println("\nUpdated Employee Records:");
        manager.traverseEmployees();
    }
}
