package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    public Penguin(String name, String habitat, float swimmingDepth) {
        super(name, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin [name=" + name + ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }
}
