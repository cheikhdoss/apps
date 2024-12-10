package app3;

import java.util.Scanner;

public interface IMontre {
public Montre saisie();
public void affiche(Montre m);
}

class IMMontre implements IMontre
{
	public Montre saisie() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("saisir id ");
		int id=scanner.nextInt();
		scanner.nextLine();//parce que consomme le caractere apres que j ai appuiye sur entre
						////et puis saute l entree au clavier si dessous
		
		System.out.println("saisir le libelle; ");
		String lib =scanner.nextLine();
		
		System.out.println("saisir la nature ");
		String nature =scanner.nextLine();
		
		return new Montre(id,lib,nature);
	}

	public void affiche(Montre m) {
		 System.out.println("l id: "+m.getId());
		 System.out.println("le libelle est: "+m.getLib());
		 System.out.println("la nature est : "+m.getNature());
	}
	
}
