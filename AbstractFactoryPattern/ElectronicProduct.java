package AbstractFactoryPattern;


//Concrete Product A1
public class ElectronicProduct implements Product{
    private String name;

    public ElectronicProduct(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Electronic Product Name: " + name);
    }
}
