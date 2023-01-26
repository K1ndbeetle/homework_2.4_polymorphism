import Transport.Bus;
import Transport.Car;
import Transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Car carAudi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0);

        Car carBmw = new Car(
                "BMW",
                "Z8",
                3.0);

        Car carKia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4);

        Car carHyundai = new Car(
                "Hyundai",
                "Avante",
                1.6);

        System.out.println(carAudi + "\n" +  carBmw  + "\n" +  carKia  + "\n" +  carHyundai);
        System.out.println();

        Bus busDaewoo = new Bus(
                "Daewoo",
                "BS 106",
                6.5);

        Bus busHiger = new Bus(
                "Higer",
                "KLQ 6122B",
                10);

        Bus busSetra = new Bus(
                "Setra",
                "S215 HD",
                8);

        Bus busVolvo = new Bus(
                "Volvo",
                "9500",
                7.7);

        System.out.println(busDaewoo + "\n" + busHiger + "\n" +  busSetra + "\n" +  busVolvo);
        System.out.println();

        Trucks trucksMan = new Trucks(
                "Man",
                "TGX",
                12.4);

        Trucks trucksScania = new Trucks(
                "Scania",
                "XT",
                16);

        Trucks trucksTatra = new Trucks(
                "Tatra",
                "T815",
                12.7);

        Trucks trucksRenault = new Trucks(
                "Renault",
                "Magnum",
                12.8);

        System.out.println(trucksMan + "\n" + trucksScania + "\n" +  trucksTatra + "\n" +  trucksRenault);
    }
}
