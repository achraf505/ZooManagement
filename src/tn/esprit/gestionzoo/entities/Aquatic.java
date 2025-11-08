package tn.esprit.gestionzoo.entities;

public class Aquatic implements Carnivore<Food> {

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal aquatique mange de la viande.");
        } else {
            System.out.println("L'animal aquatique ne mange pas de plantes.");
        }
    }
}
