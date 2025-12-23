package gr.aueb.cf.cf9.ch17.lifo_parking;

public class Main {
    public static void main(String[] args) {

        LifoParking parking = new LifoParking();

        parking.addCar("IAJ 3987");
        parking.addCar("GJD 5785");
        parking.addCar("KUK 9632");

        String car = parking.removeCar();
        System.out.println(car);

        car = parking.removeCar();
        System.out.println(car);

    }
}
