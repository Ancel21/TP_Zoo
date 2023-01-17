package fr.ensim.info.TP1;
import java.util.List;

public class Zoo {
	private static int visiteurs;
	private List secteurAnimaux;
	private int nbvisiteurMaxParSecteur;
	
	public Zoo(List secteurAnimaux, int nbvisiteurMaxParSecteur) {
		this.secteurAnimaux=secteurAnimaux;
		this.nbvisiteurMaxParSecteur=nbvisiteurMaxParSecteur;
		}
	
	public int getVisiteur() {
		return visiteurs;
	}
	public void setVisiteur(int visiteur) {
		this.visiteurs = visiteur;
	}
	public List getSecteurAnimaux() {
		return secteurAnimaux;
	}
	public void setSecteurAnimaux(List secteurAnimaux) {
		this.secteurAnimaux = secteurAnimaux;
	}
	public int getNbvisiteurMaxParSecteur() {
		return nbvisiteurMaxParSecteur;
	}
	public void setNbvisiteurMaxParSecteur(int nbvisiteurMaxParSecteur) {
		this.nbvisiteurMaxParSecteur = nbvisiteurMaxParSecteur;
	}
	
	public void ajouterSecteur(TypeAnimal t) {
		Secteur s = new Secteur();
		s.setTypeAnimauxDansSecteur(t);
	}
	
	public void nouveauVisiteur() {
		
	}
	
	public int getLimiteVisiteur() {
		
	}
	
	public void nouvelAnimal(Animal a) {
		
	}
	

}
