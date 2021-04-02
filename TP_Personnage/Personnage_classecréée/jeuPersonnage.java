import Personnage.*;
public class jeuPersonnage {
    public static void main(String args[]) {
        
		Personnage UnSorcier = new Personnage("Fred",100); //création d'un personnage ayant un nom et un nbr de pv
		Personnage UnMagicien = new Personnage("Bob",100);
		UnSorcier.Position(1,5); //positionnement généré par défaut
		UnMagicien.Position(2,6);
		
		System.out.println("Le nom du magicien: " + UnMagicien.LeNom()); //getter nom
		System.out.println("Le nom du sorcier: " + UnSorcier.LeNom());
		System.out.println("La vie du magicien: " + UnMagicien.LaVie()); //getter vie
		System.out.println("La vie du sorcier: " + UnSorcier.LaVie());
		System.out.println("La position x et y du magicien: x:" + UnMagicien.EnX() + " | y:" + UnMagicien.EnY()); //getter position x,y
		System.out.println("La position x et y du sorcier: x:" + UnSorcier.EnX() + " | y:" + UnSorcier.EnY());
	
		System.out.println("-----Test-----");
		System.out.println("Hello c'est " + UnMagicien.Test() + " !"); //getter nom dans classe Test
		System.out.println("Hello c'est " + UnSorcier.Test() + " !");
		
		System.out.println("-----Test up Vie +10 sur magicien-----");
		UnMagicien.AugmenteVie(10); //méthode up vie
		System.out.println("La vie du magicien: " + UnMagicien.LaVie());
		System.out.println("La vie du sorcier: " + UnSorcier.LaVie());

		System.out.println("-----Test attaque -50 sur magicien-----");
		UnSorcier.Attaque(UnMagicien,50); //méthode attaque : réduction de la vie à la fin de l'action
		System.out.println("Vie du magicien apres attaque: " + UnMagicien.LaVie());

		System.out.println("-----Test deplacement: x=+10 et y=+5-----");
		UnSorcier.SeDeplaceX(10); //méthode déplacement sur l'axe x
		UnMagicien.SeDeplaceX(10);
		UnSorcier.SeDeplaceY(5); //méthode déplacement sur l'axe y
		UnMagicien.SeDeplaceY(5);
		System.out.println("La position du sorcier: x:" + UnSorcier.EnX() + " | y:" + UnSorcier.EnY());
		System.out.println("La position du magicien: x:" + UnMagicien.EnX() + " | y:" + UnMagicien.EnY());

		System.out.println("-----Test limitation: x=+20 et y=+20-----");
		UnSorcier.SeDeplaceX(20);
		UnMagicien.SeDeplaceX(20);
		UnSorcier.SeDeplaceY(20);
		UnMagicien.SeDeplaceY(20);
		System.out.println("La position du sorcier: x:" + UnSorcier.EnX() + " | y:" + UnSorcier.EnY());
		System.out.println("La position du magicien: x:" + UnMagicien.EnX() + " | y:" + UnMagicien.EnY());
		
}
}