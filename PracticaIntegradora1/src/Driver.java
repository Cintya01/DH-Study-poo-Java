public class Driver {

    private String name;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void howMuchForTrip(Double distance){
        System.out.println("This trip will cost you" + vehicle.calculateFare(distance));
    }
}
