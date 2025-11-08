package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Aquatic poisson = new Aquatic();
        Penguin pingouin = new Penguin();
        Terrestrial lion = new Terrestrial();

        System.out.println("=== Test Prosit 8 ===");
        poisson.eatMeat(Food.MEAT);
        pingouin.eatMeat(Food.MEAT);
        lion.eatMeat(Food.MEAT);
        lion.eatPlant(Food.PLANT);
        lion.eatPlantAndMeat(Food.BOTH);

        Aquatic a = new Penguin();
        a.eatMeat(Food.MEAT);
    }
}



