public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    // constructor
    public Vehicle(String brand, int year ) {
        this.brand = brand;
        this.year = year;
    }

    //getters and setters for driver
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }

    // abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();

    // prints vehicle brand and year
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
