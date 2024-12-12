public class Main {
    public static void main(String[] args) {

        Vehicle standar = new VehicleStandar("1234", "red");
        Vehicle deluxe = new VehicleDeluxe("7890","blue", 3.0);

        Driver driver = new Driver("Juanito", standar);
        Driver secdriver = new Driver("Cin", deluxe);

        driver.howMuchForTrip(10.0);
        secdriver.howMuchForTrip(10.0);

    }
}