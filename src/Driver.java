public class Driver {
    private String name;
    private String licenseNumber;

    // constructor
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // print driver info
    public void displayDriverInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}