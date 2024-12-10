package app3;

import java.util.Scanner;

public interface IChemise {
public Chemise saisie();
public void affiche (Chemise c);
}

class IMChemise implements IChemise{
	public Chemise saisie() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("saisir id ");
		int id=scanner.nextInt();
		scanner.nextLine();//parce que consomme le caractere apres que j ai appuiye sur entre
						////et puis saute l entree au clavier si dessous
		
		System.out.println("saisir le libelle: ");
		String lib=scanner.nextLine();
		
		
		System.out.println("saisir la nature ");
		String couture=scanner.nextLine();
		
		
		
		
		
		return new Chemise(id,lib,couture);
	}
	

	public void affiche(Chemise c) {
		System.out.println("l id est: "+c.getId());
		 System.out.println("le libelle est: "+c.getLib());
		 System.out.println("la couture: "+c.getCouture());
	}
}
