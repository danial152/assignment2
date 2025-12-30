public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    // constructor
    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }
    // override from vehicle
    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }
}