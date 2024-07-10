package AbstractFactoryPattern;


//Concrete Product A2
public class FurnitureProduct implements Product{
    private String name;


    public FurnitureProduct(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Furniture product" + name);
    }
}
