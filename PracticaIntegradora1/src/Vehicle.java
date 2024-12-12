public abstract class Vehicle {

    private static Double PRICE_PER_KILOMETER = 100.0;

    private String licensePlate;
    private String color;


    public Vehicle(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public Double calculateFare(Double distanceInKM){
    return distanceInKM * PRICE_PER_KILOMETER;
    }
}
