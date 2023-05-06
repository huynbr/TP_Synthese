import payables.Employe;
import payables.EmployeSalarie;

//
// TODO 01-- Ajoutez tout le code nécessaire pour coder la classe au complet coder la classe au completen vous basant sur le diagramme UML
//         ainsi que la gestion des erreurs possibles si nécessaire
//
public class EmployeSalarieAvecCommission extends EmployeSalarie {
    private double tauxCommission;
    private double ventesBrutes;

    public EmployeSalarieAvecCommission(int ID,String n, String nas, double s, double tC, double vB, double m){
        super(ID, n, nas, s);
        setTauxCommission(tC);
        setVentesBrutes(vB);
    }
    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double taux) {
        if (taux >= 0 && taux <= 1) {
            tauxCommission = taux;
        } else {
            throw new IllegalArgumentException("Le taux de commission doit être entre 0 et 1.");
        }
    }

    public double getVentesBrutes() {
        return ventesBrutes;
    }

    public void setVentesBrutes(double ventes) {
        if (ventes > 0) {
            ventesBrutes = ventes;
        } else {
            throw new IllegalArgumentException("Les ventes brutes doivent être nulles ou positives.");
        }
    }

    public double getMontantCommission() {
        return ventesBrutes * tauxCommission;
    }

    public double getMontantPaiement() {
        return getSalaireHebdomadaire() + getMontantCommission();
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de commission: " + tauxCommission + ", Ventes brutes: " + ventesBrutes;
    }

    public String toStringSauvegarde() {
        return super.toStringSauvegarde() + ";" + tauxCommission + ";" + ventesBrutes;
    }

    public String toStringAffichage() {
        return super.toStringAffichage() + "\nTaux de commission: " + tauxCommission + "\nVentes brutes: " + ventesBrutes;
    }
}