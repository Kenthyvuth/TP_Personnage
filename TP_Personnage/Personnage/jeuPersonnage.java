import Personnage.*;
public class jeuPersonnage{
    public static void main(String args[]){
        
		Personnage UnSorcier = new Personnage("Fred",70);
		Personnage UnMagicien = new Personnage("Bob",80);

		System.out.println("Le nom du magicien: " + UnMagicien.LeNom());
		System.out.println("Le nom du sorcier: " + UnSorcier.LeNom());
		System.out.println("La vie du magicien: " + UnMagicien.LaVie());
		System.out.println("La vie du sorcier: " + UnSorcier.LaVie());
		
		System.out.println("---------Test up Vie (+10) sur magicien---------");
		UnMagicien.AugmenterVie(10);
		System.out.println("La vie du magicien " + UnMagicien.LaVie());
		System.out.println("La vie du sorcier " + UnSorcier.LaVie());

		System.out.println("---------Test attaque sur magicien (-50)---------");
		UnSorcier.Attaque(UnMagicien,50);
		System.out.println("Vie du magicien apres attaque " + UnMagicien.LaVie());
		
		
}
}