package Practice.AnimalExample;

import Practice.AnimalExample.Animal;

public class Parrot implements Animal {
    String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getSpecies() {
        return "bird";
    }

    @Override
    public String getType() {
        return "carnivore";
    }

    @Override
    public int getLegs() {
        return 2;
    }
}
