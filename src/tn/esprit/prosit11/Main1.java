package tn.esprit.prosit11;

import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();

        Employe1 e1 = new Employe1(1, "Alice");
        Employe1 e2 = new Employe1(2, "Bob");
        Departement d1 = new Departement(101, "RH");
        Departement d2 = new Departement(102, "IT");

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);

        affectation.afficherEmployesEtDepartements();

        affectation.ajouterEmployeDepartement(e1, d2);
        System.out.println("\nAprès avoir réaffecté Alice à IT :");
        affectation.afficherEmployesEtDepartements();

        affectation.supprimerEmploye(e2);
        System.out.println("\nAprès suppression de Bob :");
        affectation.afficherEmployesEtDepartements();

        TreeMap<Employe1, Departement> sortedMap = affectation.trierMap();
        System.out.println("\nMap triée par ID employé :");
        for (var entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
