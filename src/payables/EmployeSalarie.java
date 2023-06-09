package payables;

public class EmployeSalarie extends Employe {
	private double salaireHebdomadaire;
	//
	// TODO 02-- Ajoutez tout le code nécessaire pour coder la classe au complet coder la classe au completen vous basant sur le diagramme UML
	//         ainsi que la gestion des erreurs possibles si nécessaire
	//
	public EmployeSalarie(int ID, String n, String nas, double s, String m) {
		super(ID, n, nas, s, m);
		setSalaireHebdomadaire(s);
	}

	public double getSalaireHebdomadaire() {
		return salaireHebdomadaire;
	}
	public void setSalaireHebdomadaire(double salaire) {
		if(salaire > 0){
			salaireHebdomadaire = salaire;
		} else {
			throw new IllegalArgumentException("Le salaire hebdomadaire doit être positif.");
		}
	}

	@Override
	public double getMontantPaiement() {
		return getSalaireHebdomadaire();
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %,.2f",
				getCategorieString(), super.toString(), "salaire hebdomadaire", getSalaireHebdomadaire());
	}

	public String toStringAffichage() {
			String info = super.toStringAffichage();
			info += " Salaire [" + this.getSalaireHebdomadaire()  + "]";
			return info;
	}

	public String toStringSauvegarde() {
		String info = String.format("ID [%3d] Nom complet [%20s] NAS [%9s] Salaire [%6.2f] Mémo [%15s] Catégorie [%20s]",
				this.getID(), this.getNomComplet(), this.getNumeroAssuranceSociale(),
				this.getSalaireHebdomadaire(), this.getMemo(), this.getCategorieString());
		return info;
	}
}
