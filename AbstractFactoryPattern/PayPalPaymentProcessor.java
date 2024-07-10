package AbstractFactoryPattern;


//Concrete Product B2 - PayPal
public class PayPalPaymentProcessor implements PaymentProcessor{
    @Override
    public void pay() {
        System.out.println("Payment of PayPal");
    }
}
