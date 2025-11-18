package tn.esprit.prosit11;
import java.util.Objects;

public class Employe1 implements Comparable<Employe1> {
    private int id;
    private String nom;

    public Employe1(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom='" + nom + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe1)) return false;
        Employe1 employe = (Employe1) o;
        return id == employe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employe1 other) {
        return Integer.compare(this.id, other.id);
    }
}
