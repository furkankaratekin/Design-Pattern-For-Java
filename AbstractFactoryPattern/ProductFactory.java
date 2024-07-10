package AbstractFactoryPattern;


//Abstract Factory
public interface ProductFactory {
    Product createProduct();
    PaymentProcessor createPaymentProcessor();
}
