public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        Customer foundCustomer = service.getCustomerDetails("C101");

        if (foundCustomer != null) {
            System.out.println("Customer found");
            System.out.println("Id   : " + foundCustomer.getId());
            System.out.println("Name : " + foundCustomer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
