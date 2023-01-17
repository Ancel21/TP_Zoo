package fr.ensim.info.TP1;

import java.util.List;

public class Secteur {
	
	private TypeAnimal typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	public Secteur() {
		
	}
	
	public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		//this.animauxDansSecteur = typeAnimauxDansSecteur;
	}
	
	public TypeAnimal getTypeAnimauxDansSecteur() {
		return typeAnimauxDansSecteur;
	}
	public void setTypeAnimauxDansSecteur(TypeAnimal typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}
	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}
	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}
	
	public void ajouterAnimal(Animal a) {
		
	}
	
	public int getNombreAnimaux() {
		
	}
	
	public TypeAnimal obtenirType() {
		
	}

}
