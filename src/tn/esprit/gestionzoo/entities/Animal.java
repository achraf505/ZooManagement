package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;

    public Animal() { this.name = "Unknown"; this.age = 0; }
    public Animal(String name, int age) throws InvalidAgeException {
        if (age < 0) throw new InvalidAgeException("L'âge ne peut pas être négatif.");
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) throw new InvalidAgeException("L'âge ne peut pas être négatif.");
        this.age = age;
    }

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

