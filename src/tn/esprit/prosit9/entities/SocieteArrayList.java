package tn.esprit.prosit9.entities;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {

    private List<Employe> liste;

    public SocieteArrayList() {
        this.liste = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe t) {
        if (!liste.contains(t)) {
            liste.add(t);
            System.out.println("Employé ajouté : " + t);
        } else {
            System.out.println("Employé déjà existant : " + t);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Employé trouvé (par nom) : " + e);
                return true;
            }
        }
        System.out.println("Aucun employé trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        boolean found = liste.contains(t);
        System.out.println(found ? "Employé trouvé : " + t : "Employé non trouvé : " + t);
        return found;
    }

    @Override
    public void supprimerEmploye(Employe t) {
        if (liste.remove(t)) {
            System.out.println("Employé supprimé : " + t);
        } else {
            System.out.println("Aucun employé trouvé à supprimer : " + t);
        }
    }

    @Override
    public void afficherEmploye() {
        if (liste.isEmpty()) {
            System.out.println("Aucun employé à afficher.");
            return;
        }
        System.out.println("=== Liste des employés ===");
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste);
        System.out.println("Tri par ID effectué.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNom, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Employe::getNomDepartement, String.CASE_INSENSITIVE_ORDER)
                .thenComparingInt(Employe::getGrade);
        liste.sort(comparator);
        System.out.println("Tri par Nom / Département / Grade effectué.");
    }
}
