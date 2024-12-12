public class Motorcicle extends Vehicle {

    private String brandName;

    public Motorcicle(String licensePlate, String color, String brandName) {
        super(licensePlate, color, 2);
        this.brandName = brandName;
    }


}
