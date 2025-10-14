package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;

    public Animal() { this.name = "Unknown"; this.age = 0; }
    public Animal(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = Math.max(age, 0); }

    @Override
    public String toString() { return "Animal [name=" + name + ", age=" + age + "]"; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return age == other.age && name.equals(other.name);
    }
}

