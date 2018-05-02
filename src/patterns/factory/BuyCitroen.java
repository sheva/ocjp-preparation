package patterns.factory;

public class BuyCitroen implements BuyCar {

    @Override
    public Car buy() {
        Citroen citroen = new Citroen();
        citroen.setTitle("CO567GH");
        return citroen;
    }
}
