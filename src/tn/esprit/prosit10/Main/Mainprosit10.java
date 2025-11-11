package tn.esprit.prosit10.Main;

import tn.esprit.prosit10.entites.Departement;
import tn.esprit.prosit10.entites.DepartementHashSet;
import java.util.TreeSet;
public class Mainprosit10 {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Ressources Humaines", 10);
        Departement d3 = new Departement(3, "Finance", 15);
        Departement d4 = new Departement(1, "Informatique", 25);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);

        gestion.displayDepartement();

        gestion.rechercherDepartement("Finance");
        gestion.rechercherDepartement(d2);

        gestion.supprimerDepartement(d2);
        gestion.displayDepartement();

        TreeSet<Departement> sorted = gestion.trierDepartementById();
        System.out.println("Départements triés par ID :");
        for (Departement d : sorted) {
            System.out.println(d);
        }
    }
}
