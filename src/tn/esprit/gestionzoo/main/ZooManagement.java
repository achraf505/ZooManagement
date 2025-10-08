package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Belv", "Tunis");

        Dolphin dolphin = new Dolphin("Flipper", "Sea", 30.5f);
        Penguin penguin = new Penguin("Pingu", "Antarctica", 15.0f);
        Aquatic aquatic = new Aquatic("Nemo", "Ocean");

        zoo.addAnimal(dolphin);
        zoo.addAnimal(penguin);
        zoo.addAnimal(aquatic);

        zoo.displayAnimals();

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}


