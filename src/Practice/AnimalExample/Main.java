package Practice.AnimalExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Animal cat = new Cat();
        Animal parrot = new Parrot();
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(cat);
        listOfAnimals.add(parrot);

        listAnimalsWithDetails_using_lambda(listOfAnimals);


    }

    private static void listAnimalsWithDetails_using_lambda(List<Animal> listOfAnimals) {
        listOfAnimals.forEach(animal -> {
            System.out.println(animal.getName() + " is of " + animal.getSpecies() +
                    " species having "+ animal.getLegs() + " legs.");
        });
    }

    private static void listAnimalsWithDetails2(List<Animal> listOfAnimals) {
        for(Animal animal : listOfAnimals) {
            System.out.println(animal.getName() + " is of " + animal.getSpecies() +
                    " species having "+ animal.getLegs() + " legs.");
        }
    }

    private static void listAnimalsWithDetails(List<Animal> listOfAnimals) {
        for(int i = 0; i <  listOfAnimals.size(); i++) {
            Animal animal = listOfAnimals.get(i);
            System.out.println(animal.getName() + " is of " + animal.getSpecies() +
                    " species having "+ animal.getLegs() + " legs.");
        }
    }

    private static void loopTest() {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}