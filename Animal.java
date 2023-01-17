package fr.ensim.info.TP1;

public class Animal {
	private String nomAnimal;
	private TypeAnimal typeAnimal;
	
	public Animal() {
		
	}
	
	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	
	

	

}


class Chien extends Animal{
	
	public Chien() {
		super();
	}
	
	public String getNomAnimal() {
		return getNomAnimal();
	}	
	
}


class Chat extends Animal{
	
	public Chat() {
		super();
	}
	
	public String getNomAnimal() {
		return getNomAnimal();
	}	
	
}


