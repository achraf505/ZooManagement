package tn.esprit.gestionzoo.entities;

 public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() { super("Unknown Aquatic"); this.habitat = "Unknown"; }
    public Aquatic(String name, String habitat) { super(name); this.habitat = habitat; }

    public void swim() { System.out.println("This aquatic animal is swimming."); }

    @Override
    public String toString() { return "Aquatic [name=" + name + ", habitat=" + habitat + "]"; }
}
