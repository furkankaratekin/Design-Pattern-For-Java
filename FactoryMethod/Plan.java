package FactoryMethod;

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }


}
//Bu class bir soyut sınıf
