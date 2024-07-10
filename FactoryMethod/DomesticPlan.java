package FactoryMethod;

public class DomesticPlan extends Plan{

    @Override
    void getRate() {
        rate=3.50;
    }
}

//Ev içi plan sınıfı burada rate 3.50 olarak ayarladık.