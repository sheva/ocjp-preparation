package patterns.factory;

public class BuySubaru implements BuyCar {

    @Override
    public Car buy() {
        Subaru car = new Subaru();
        car.setTitle("the second car");
        return car;
    }
}
