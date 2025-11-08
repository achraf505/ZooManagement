package tn.esprit.gestionzoo.entities;

public class Terrestrial implements Omnivore<Food> {

    @Override
    public void eatMeat(Food meat) {
        System.out.println("L’animal terrestre mange de la viande.");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("L’animal terrestre mange des plantes.");
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("L’animal terrestre mange de tout !");
    }
}