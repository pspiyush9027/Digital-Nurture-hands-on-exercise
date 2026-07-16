public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String customerId) {
        if ("C101".equals(customerId)) {
            return new Customer("C101", "Aman Gupta");
        }

        if ("C102".equals(customerId)) {
            return new Customer("C102", "Sneha Joshi");
        }

        return null;
    }
}
