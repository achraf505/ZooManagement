package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;

    public Animal() {
        this.name = "Unknown";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return name.equals(other.name);
    }
}
