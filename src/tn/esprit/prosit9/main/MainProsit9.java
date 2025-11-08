package tn.esprit.prosit9.main;

import tn.esprit.prosit9.entities.Employe;
import tn.esprit.prosit9.entities.SocieteArrayList;

public class MainProsit9 {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben", "Ali", "IT", 2);
        Employe e2 = new Employe(1, "Mehdi", "Khaled", "RH", 1);
        Employe e3 = new Employe(2, "Ben", "Salah", "Finance", 3);
        Employe e4 = new Employe(4, "Amina", "Youssef", "IT", 2);
        Employe e5 = new Employe(2, "Ben", "Salah", "Finance", 3); // même id + nom que e3

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5); // ne s’ajoute pas (déjà existant)

        societe.afficherEmploye();

        societe.rechercherEmploye("Ben");
        societe.rechercherEmploye(e2);

        societe.trierEmployeParId();
        societe.afficherEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.afficherEmploye();

        societe.supprimerEmploye(e2);
        societe.afficherEmploye();
    }
}
