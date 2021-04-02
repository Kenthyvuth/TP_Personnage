package Personnage;
public class Personnage {

	//Le Constructeur
    	public Personnage(String name,int life) {
        	this.nom = name;
        	this.vie = life;
	}

	//Accesseur (ou Getter) du nom du personnage
	public String LeNom() {
		return this.nom;
	}
	
	//Accesseur sur le nombre de points de vie du personnage
	public int LaVie() {
		return this.vie;
	}

	//Méthode AugmenterVie
	public void AugmenteVie(int gain) {
		this.vie = this.vie + gain;		
	}

	//Méthode attaque
	public void Attaque(Personnage perso,int force) {
		perso.vie = perso.vie - force;
	}

	//Méthode Test
	public String Test() {
		return this.LeNom();
	}

	//Le Constructeur pour le positionnement du joueur
	public void Position(int positionX,int positionY) {
		this.posX = positionX;
		this.posY = positionY;
	}
	
	//Getter sur la position x du joueur
	public int EnX() {
		return this.posX;
	}

	//Getter sur la position y du joueur
	public int EnY() {
		return this.posY;
	}

	//Méthode déplacement pour x
	public void SeDeplaceX(int bouge) {
		if (bouge<=10) {
			this.posX = this.posX + bouge;
		}
		else {
			this.posX = this.posX + 10;
			System.out.println("( " + this.nom + " ne peut exceder 10 en x ! Par consequent, il ne se deplace que de 10.)");
		}
	}

	//Méthode déplacement pour y
	public void SeDeplaceY(int bouge) {
		if (bouge<=10) {
			this.posY = this.posY + bouge;
		}
		else {
			this.posY = this.posY + 10;
			System.out.println("( " + this.nom + " ne peut exceder 10 en y ! Par consequent, il ne se deplace que de 10.)");
		}
	}

	//Les attributs
	private String nom;
	private int vie;
	private int posX;
	private int posY;
}