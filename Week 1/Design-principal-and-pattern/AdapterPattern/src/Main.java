public class Main {
    public static void main(String[] args) {
        PaymentProcessor firstPayment = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor secondPayment = new StripeAdapter(new StripeGateway());
        PaymentProcessor thirdPayment = new BankTransferAdapter(new BankTransferGateway());

        System.out.println("Trying three different payment gateways:");
        System.out.println();

        firstPayment.processPayment(2500.0);
        System.out.println();

        secondPayment.processPayment(4300.5);
        System.out.println();

        thirdPayment.processPayment(1200.75);
    }
}
