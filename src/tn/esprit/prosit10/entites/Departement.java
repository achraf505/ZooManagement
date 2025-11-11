package tn.esprit.prosit10.entites;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nbEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmployes = nbEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        Departement other = (Departement) obj;
        return id == other.id && Objects.equals(nomDepartement, other.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }

    @Override
    public int compareTo(Departement other) {
        return Integer.compare(this.id, other.id);
    }
}