package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус " + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand() + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автобуса " + getBrand() + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса " + getBrand() + getModel());
    }
}
