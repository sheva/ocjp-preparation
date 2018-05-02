package patterns.factory;

public class Citroen implements Car {

    private String graniesCar;

    @Override
    public void setTitle(String title) {
        graniesCar = title;
    }

    @Override
    public void driveIt() {
        System.out.println("Everyone in our family could drive " + graniesCar);
    }
}
