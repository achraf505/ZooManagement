package tn.esprit.prosite12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(3, "isra", 20));
        etudiants.add(new Etudiant(1, "marwa", 22));
        etudiants.add(new Etudiant(2, "farah", 19));

        System.out.println("Tous les étudiants ");
        sm.displayStudents(etudiants, System.out::println);

        System.out.println("\n Étudiants majeurs (age >= 20) ");
        sm.displayStudentsByFilter(etudiants, e -> e.getAge() >= 20, System.out::println);

        System.out.println("\n Noms des étudiants ");
        String noms = sm.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println(noms);

        System.out.println("\n Création d'un nouvel étudiant ");
        Etudiant nouveau = sm.createStudent(() -> new Etudiant(4, "Achraf", 25));
        System.out.println(nouveau);

        System.out.println("\n Étudiants triés par ID ");
        List<Etudiant> sorted = sm.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        sm.displayStudents(sorted, System.out::println);

        System.out.println("\n  Stream des étudiants ");
        sm.convertToStream(etudiants).forEach(System.out::println);
    }
}
