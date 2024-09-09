package parking;

//@author  Tejaswi Allam

public class Car {

    private String model;
    private String licensePlate; 

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate; 
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate; 
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{licensePlate='" + this.getLicensePlate() + "', model='" + this.getModel() + "'}";
    }
}
