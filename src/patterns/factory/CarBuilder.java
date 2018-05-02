package patterns.factory;

// Client
public class CarBuilder {

    public static Car buildCarOfMyDream(BuyCar factory) {
        return factory.buy();
    }

    public static void main(String... args) {

        final BuyCar factory;

        if (args.length > 0 && args[0].equals("Citroen")) {
            factory = new BuyCitroen();
        } else {
            factory = new BuySubaru();
        }

        Car myDreamCar = buildCarOfMyDream(factory);
        myDreamCar.driveIt();
    }
}
