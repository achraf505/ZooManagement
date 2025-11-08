package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    @Override
    public void eatMeat(Food meat) {
        System.out.println("Le pingouin mange du poisson !");
    }
}