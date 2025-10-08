package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int NBR_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = (name == null || name.trim().isEmpty()) ? "Zoo par défaut" : name; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) return false;
        for (int i = 0; i < animalCount; i++) if (animals[i].equals(animal)) return false;
        animals[animalCount++] = animal;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux du zoo :");
        for (int i = 0; i < animalCount; i++) System.out.println("[" + i + "] " + animals[i]);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) if (animals[i].equals(animal)) return i;
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < animalCount - 1; i++) animals[i] = animals[i + 1];
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public boolean isZooFull() { return animalCount >= NBR_CAGES; }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) { return z1.animalCount >= z2.animalCount ? z1 : z2; }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + ", Animaux présents=" + animalCount + "]";
    }
}
