package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String name, String habitat, float swimmingSpeed) {
        super(name, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [name=" + name + ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
}
