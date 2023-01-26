package Transport;

import Interfaces.Competing;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (brand == "" || brand == null || brand == "null") {
            this.brand = "default";
        } else this.brand = brand;
        if (model == "" || model == null || model == "null") {
            this.model = "default";
        } else this.model = model;
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.2;
        } else this.engineVolume = engineVolume;
    }

    public abstract void startMove();

    public abstract void finishMove();

    @Override
    public String toString() {
        return "Марка " + brand +
                ", " + "модель " + model +
                ", " + "объём двигателя - " + engineVolume + " л.с.";
    }
}
