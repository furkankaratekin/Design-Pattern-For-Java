package AbstractFactoryPattern;

import java.util.Scanner;

public class FurnitureProductFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        //Simülasyon için konsoldan ürün adı al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter furniture product name: ");
        String productName = scanner.nextLine();
        return new FurnitureProduct(productName);
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }
}
