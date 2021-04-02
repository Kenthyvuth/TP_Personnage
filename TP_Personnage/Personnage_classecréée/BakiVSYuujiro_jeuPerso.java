import Personnage.*;
public class BakiVSYuujiro_jeuPerso {
	public static void main(String args[]) {
		
		System.out.println("\nCreation des personnages...");
		System.out.println(" "); //Saut d'une ligne
		Personnage Champion = new Personnage("Baki",3000); //Constructeur d'un personnage ayant un nom et un nombre de Points de Vie
		Personnage Ogre = new Personnage("Yuujiro",5000);
		Personnage ToutPuissant = new Personnage("Yuichiro",1); //Personnage bonus qui sera introduit plus tard
		Champion.Position(0,0); //Constructeur de la position x et y du personnage
		Ogre.Position(9,5);
		System.out.println("Caracteristiques des personnages: ");
		System.out.println("-->Champion: " + Champion.LeNom() + " | "+ Champion.LaVie() + " PV | 500 points de degats"); //getter sur le nom et sur les PV
		System.out.println("-->Ogre: " + Ogre.LeNom() + " | "+ Ogre.LaVie() + " PV | 500 points de degats");
		System.out.println(" ");
		System.out.println("Position initiale de chaque personnage (x,y):");
		System.out.println("--> Champion (" + Champion.EnX() + "," + Champion.EnY() + ")"); //Getter sur la position du personnage
		System.out.println("--> Ogre (" + Ogre.EnX() + "," + Ogre.EnY() + ")");		

		System.out.println(Champion.LeNom() + " se dirige vers " + Ogre.LeNom() + " ...");
		Champion.SeDeplaceY(5); //Méthode pour faire déplacer sur l'axe y
		Champion.SeDeplaceX(6); //Méthode pour faire déplacer sur l'axe x
		Ogre.SeDeplaceX(-2);
		System.out.println(" ");
		System.out.println("Position finale: ");
		System.out.println("--> Champion (" + Champion.EnX() + "," + Champion.EnY() + ")");
		System.out.println("--> Ogre (" + Ogre.EnX() + "," + Ogre.EnY() + ")");
		System.out.println("Les deux personnages sont face a face.");
		System.out.println("\n---------Le combat commence !---------");
		System.out.println(" ");

		Ogre.Attaque(Champion,500); //Méthode pour l'attaque d'un personnage sur un autre personnage
		Champion.Attaque(Ogre,500);
		System.out.println("Echange de coups ! Ils infligent l'un a l'autre 500 points de degats."); //Baki:2500;Yuujiro:4500
		System.out.println("Il reste au Champion " + Champion.LaVie() + " PV, et a l'Ogre " + Ogre.LaVie() + " PV.");
		Champion.SeDeplaceX(-3);
		System.out.println(Champion.Test() + " prend de l'elan en reculant de 3 cases, et se prepare a lancer une technique.");
		Champion.Attaque(Ogre,1500); //Yuujiro:3000
		Ogre.SeDeplaceX(3);
		System.out.println("L'attaque est un succes ! " + Ogre.Test() + " recoit 1500 points de degats et recule de 3 cases ! Pris de rage, il avance tres rapidement vers " + Champion.LeNom() + " de 6 cases !");
		Ogre.SeDeplaceX(-6);
		System.out.println("Il concentre sa force dans son poing en lui infligeant 1000 points de degats.");
		Ogre.Attaque(Champion,1000); //Baki:1500
		System.out.println("Le Champion tente de contrer mais sans reussite: il perd 1250 PV en plus !");
		Champion.AugmenteVie(-1250); //Baki:250 //Méthode pour augmenter les PV du personnage(dans cette ligne on diminue ses PV)
		System.out.println(Champion.LeNom() + " n'a plus que 250 PV. L'Ogre se prepare a lancer le coup final, mais ...!");
		ToutPuissant.Position(5,5); //Introduction du troisième personnage par sa mise en place sur le terrain
		System.out.println("Un autre combattant entre dans le jeu et apparait derriere l'Ogre. Il s'agit du ToutPuissant, " + ToutPuissant.LeNom() + " !");
		System.out.println(ToutPuissant.LeNom() + " interrompt le coup de " + Ogre.LeNom() + " en le blessant fatalement !");
		ToutPuissant.Attaque(Ogre,2000); //Yuujiro:1000
		System.out.println("Il reste alors a l'Ogre plus que " + Ogre.LaVie() + " PV ! Le ToutPuissant disparait en conferant au Champion un bonus de degats (x2).");
		Ogre.Attaque(Champion,500);
		System.out.println(Ogre.LeNom() + " assene un coup fatal a " + Champion.LeNom() + " mais ce dernier le contre parfaitement et lui renvoie le coup.");
		Champion.AugmenteVie(500);
		Champion.Attaque(Ogre,1000);
		System.out.println("Combat termine !! " + Champion.LeNom() + " a vaincu son ennemi " + Ogre.LeNom() + " ! L'Ogre a alors " + Ogre.LaVie() + " PV et le Champion " + Champion.LaVie() + " PV !");
		System.out.println(" ");
		System.out.println("Position de " + Champion.LeNom() + " sur le terrain: ("+ Champion.EnX() + "," + Champion.EnY() + ")");

		System.out.println("\n---------Sequence des actions du combat---------");
		System.out.println(" ");
		System.out.println("(Attaque) Ogre -> Champion (500)");
		System.out.println("(Attaque) Champion -> Ogre (500)");
		System.out.println("(Deplacement) Champion: x->-3 | y->0");
		System.out.println("(Attaque) Champion -> Ogre (1500)");
		System.out.println("(Deplacement) Ogre: x->3 | y->0");
		System.out.println("(Deplacement) Ogre: x->-6 | y->0");
		System.out.println("(Attaque) Ogre -> Champion (1000)");
		System.out.println("(AugmentationVie) Champion (-1250)");
		System.out.println("(Deplacement)(Intervention) ToutPuissant: x=5 | y=5");
		System.out.println("(Attaque) ToutPuissant -> Ogre (2000)");
		System.out.println("(Attaque) Ogre -> Champion (500)");
		System.out.println("(AugmentationVie) Champion (500)");
		System.out.println("(Attaque) Champion -> Ogre (1000)");
		System.out.println("--------->Fin");		
	}		
}