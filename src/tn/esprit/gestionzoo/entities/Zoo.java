package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int NBR_CAGES = 25;
    private final int MAX_AQUATICS = 10;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int animalCount = 0;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATICS];
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

    public boolean isZooFull() { return animalCount >= NBR_CAGES; }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < MAX_AQUATICS) aquaticAnimals[aquaticCount++] = aquatic;
    }

    public void displayAquaticSwim() {
        for (int i = 0; i < aquaticCount; i++) aquaticAnimals[i].swim();
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > max) max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + ", Animaux présents=" + animalCount + "]";
    }
}

