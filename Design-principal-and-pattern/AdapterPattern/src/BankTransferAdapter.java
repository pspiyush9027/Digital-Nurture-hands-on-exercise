public class BankTransferAdapter implements PaymentProcessor {
    private final BankTransferGateway bankGateway;

    public BankTransferAdapter(BankTransferGateway bankGateway) {
        this.bankGateway = bankGateway;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Routing payment through Bank Transfer adapter...");
        bankGateway.sendMoney(amount);
    }
}
