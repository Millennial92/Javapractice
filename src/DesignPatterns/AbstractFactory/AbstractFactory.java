package DesignPatterns.AbstractFactory;

enum CarType
{
    MICRO , MINI , LUXURY
}

enum Location
{
    DEFAULT , INDIA , USA
}

abstract class AbstractCarFactory {

    AbstractCarFactory(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    CarType model = null;
    Location location = null;

    CarType getModel() {
        return model;
    }

    void setModel(CarType model) {
        this.model = model;
    }

    Location getlocation() {
        return location;
    }

    void setLocation(Location location) {
        this.location = location;
    }

    public String toString() {
        return "CarModel - " + model + "located in " + location;
    }
}

