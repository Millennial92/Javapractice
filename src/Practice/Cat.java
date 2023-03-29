package Practice;

public class Cat implements Animal{
String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String getName() {
        return "cat";
    }

    @Override
    public String getSpecies() {
        return "mammal";
    }

    @Override
    public String getType() {
        return "carnivore";
    }

    @Override
    public int getLegs() {
        return 4;
    }

}
