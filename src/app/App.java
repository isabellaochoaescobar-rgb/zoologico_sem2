package app;

import model.*;

public class App {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("Zoo UQ");
        Animal animal = new Animal("Animal", "123", "Animal1");

        Animal animal1 = new Mono("Zoo UQ", "123", "Mono","Brayan", "10", 11, "Selva");
        Animal animal2 = new Leon("Zoo UQ", "123", "Leon", "Alex", "77", "Sabana", 6 );
        Animal animal3 = new Oveja("Zoo UQ", "123","Oveja", "Laura", "17", "Granja", 18);
        Animal animal4 = new Lobo("Zoo UQ", "123", "Lobo","Nicole", "12", "Bosque", 5);
        Animal animal5 = new Pantera("Zoo UQ", "123", "Pantera", "Jose", 8, "19", "Selva", 11);


        zoo.registrarAnimal(animal1);
        zoo.registrarAnimal(animal2);
        zoo.registrarAnimal(animal3);
        zoo.registrarAnimal(animal4);
        zoo.registrarAnimal(animal5);






    }
}
