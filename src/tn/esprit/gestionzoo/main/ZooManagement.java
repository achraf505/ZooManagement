package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Belv", "Tunis");

        Dolphin dolphin1 = new Dolphin("Flipper", 5, "Sea", 30.5f);
        Dolphin dolphin2 = new Dolphin("Dolly", 4, "Ocean", 28.0f);
        Penguin penguin1 = new Penguin("Pingu", 3, "Antarctica", 15.0f);
        Penguin penguin2 = new Penguin("Kowalski", 6, "Arctic", 20.0f);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        zoo.displayAquaticSwim();
        System.out.println("Profondeur maximale des pingouins : " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
    }
}


