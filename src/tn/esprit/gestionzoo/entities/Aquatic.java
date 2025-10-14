package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() { super("Unknown Aquatic", 0); this.habitat = "Unknown"; }
    public Aquatic(String name, int age, String habitat) { super(name, age); this.habitat = habitat; }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    public abstract void swim();

    @Override
    public String toString() { return "Aquatic [name=" + name + ", age=" + age + ", habitat=" + habitat + "]"; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        return age == other.age && name.equals(other.name) && habitat.equals(other.habitat);
    }
}
