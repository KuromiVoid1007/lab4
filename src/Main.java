public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle boat = new Boat();
        garage.operateVehicle(car);
        garage.operateVehicle(bicycle);
        garage.operateVehicle(boat);
    }
}