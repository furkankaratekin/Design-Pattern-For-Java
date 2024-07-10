package AbstractFactoryPattern;

import java.util.Scanner;

//Concrete Factory A
public class ElectronicProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        //Simülasyon için konsoldan ürün adı aldım
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter electronic product name: ");
        String productName = scanner.nextLine();
        return new ElectronicProduct(productName);
    }

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PayPalPaymentProcessor();
    }
}
