package tn.esprit.prosite12;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        for (Etudiant e : students) con.accept(e);
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant e : students) if (pre.test(e)) con.accept(e);
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        StringBuilder sb = new StringBuilder();
        for (Etudiant e : students) sb.append(fun.apply(e)).append(" ");
        return sb.toString().trim();
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        List<Etudiant> sortedList = new ArrayList<>(students);
        sortedList.sort(com);
        return sortedList;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }
}