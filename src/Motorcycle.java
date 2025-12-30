public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // constructor
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    //override from vehicle
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}