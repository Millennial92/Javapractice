package DesignPatterns.AbstractFactory;

public class LuxuryCar extends AbstractCarFactory {

    LuxuryCar(CarType model, Location location) {
        super(model, location);
    }

    @Override
    void construct() {

    }
}

