package AbstractFactoryPattern;

import java.util.Scanner;

public class EcommerceClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Product Category:");
        System.out.println("1. Electronic Products");
        System.out.println("2. Furniture Products");
        int choice = scanner.nextInt();

        ProductFactory factory = null;
        switch (choice) {
            case 1:
                factory = new ElectronicProductFactory();
                break;
            case 2:
                factory = new FurnitureProductFactory();
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        //Ürün yarat ve bilgilerini göster
        Product product = factory.createProduct();
        product.info();

        //Ödeme işlemi yap
        PaymentProcessor paymentProcessor = factory.createPaymentProcessor();
        paymentProcessor.pay();



    }
}
