package tn.esprit.prosit10.entites;


import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté : " + d);
        } else {
            System.out.println("Département déjà existant : " + d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom)) {
                System.out.println("Département trouvé (par nom) : " + d);
                return true;
            }
        }
        System.out.println("Aucun département trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        boolean existe = departements.contains(d);
        System.out.println(existe ? "Département trouvé : " + d : "Département introuvable : " + d);
        return existe;
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("Département non trouvé : " + d);
        }
    }

    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            System.out.println("Liste des départements :");
            for (Departement d : departements) {
                System.out.println(d);
            }
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }
}