
package tn.esprit.prosit11;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe1, Departement> map;

    public AffectationHashMap() {
        map = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe1 e, Departement d) {
        map.put(e, d); // un employé ne peut être affecté qu'à un seul département
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des employés et leurs départements :");
        for (Map.Entry<Employe1, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe1 e) {
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe1 e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe1 e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe1 e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    public TreeMap<Employe1, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
