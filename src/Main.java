import Transport.*;

public class Main {
    public static void main(String[] args) {
        Driver_Category_B petrov = new Driver_Category_B("Петров", true, 10);
        System.out.println(petrov);
        PassengerCar passengerCar = new PassengerCar("", "", 31.6, petrov);
        PassengerCar qashkai = new PassengerCar("Nissan", "Qashkai", 2.0, petrov);
        PassengerCar bmw = new PassengerCar("BMW", "X1", 2.0, petrov);
        PassengerCar audi = new PassengerCar("Audi", "A3", 1.8, petrov);
        System.out.println(passengerCar + "\n" + qashkai + "\n" + bmw + "\n" + audi);
        passengerCar.startMovement();
        passengerCar.stopMovement();
        qashkai.maximumSpeed();
        bmw.bestLapTime();
        audi.pit_stop();
        printInformation(petrov, bmw);
        System.out.println();

        Driver_Category_C ivanov = new Driver_Category_C("Иванов", true, 9);
        System.out.println(ivanov);
        Truck truck = new Truck("", "", 10, ivanov);
        Truck volvo = new Truck("Volvo", "FL", 2.4, ivanov);
        Truck scania = new Truck("Scania", "P440", 3.0, ivanov);
        Truck renault = new Truck("Renault", "Magnum", 12.0, ivanov);
        System.out.println(truck + "\n" + volvo + "\n" + scania + "\n" + renault);
        truck.startMovement();
        truck.stopMovement();
        volvo.pit_stop();
        scania.bestLapTime();
        renault.maximumSpeed();
        printInformation(ivanov, renault);
        System.out.println();

        Driver_Category_D sidorov = new Driver_Category_D("Сидоров", true, 20);
        System.out.println(sidorov);
        Bus bus = new Bus("", "", 0, sidorov);
        Bus volvoBus = new Bus("Volvo", "B12", 12.1, sidorov);
        Bus maz = new Bus("MAZ", "203", 12.0, sidorov);
        Bus mersedesBus = new Bus("MB", "Tourismo", 12.0, sidorov);
        System.out.println(bus + "\n" + volvoBus + "\n" + maz + "\n" + mersedesBus);
        bus.startMovement();
        bus.stopMovement();
        volvoBus.pit_stop();
        maz.bestLapTime();
        mersedesBus.maximumSpeed();
        printInformation(sidorov, volvoBus);
    }
    public static void printInformation(Driver driver, Transport transport) {
        System.out.println("Водитель " + driver.getFullName() +
                            " управляет автомобилем " + transport.getModel() +
                            " и будет участвовать в заезде.");
    }
}