public class Main {
    public static void main(String[] args) {
        // create Driver objects
        Driver driver1 = new Driver("Jane Bob", "A123");
        Driver driver2 = new Driver("John Bob", "B321");

        // create Vehicle objects
        Vehicle car = new Car("Toyota", 2025, 4, "Gasoline");
        car.setDriver(driver1);
        Vehicle motorcycle = new Motorcycle("BMW", 2023, false);
        motorcycle.setDriver(driver2);
        Vehicle truck = new Truck("Mercedez-Benz", 2024, 14.5, 4);
        truck.setDriver(driver2);

        // array of vehicles
        Vehicle[] vehicles = { car, motorcycle, truck };

        // loop through vehicles
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            v.getDriver().displayDriverInfo();
            System.out.println("");
        }
    }
}