package AbstractFactoryPattern;


//Concrete Product B1
public class CreditCardPaymentProcessor implements PaymentProcessor{


    @Override
    public void pay() {
        System.out.println("CreditCardPaymentProcessor.pay");
    }
}
