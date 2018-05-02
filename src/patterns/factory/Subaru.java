package patterns.factory;

// Concrete
public class Subaru implements Car {

    private String dadsCar;

    @Override
    public void setTitle(String title) {
        dadsCar = title;
    }

    @Override
    public void driveIt() {
        System.out.println("It is forbidden to drive " + dadsCar);
    }
}
