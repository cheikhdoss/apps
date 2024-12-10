package app3;
import java.util.Scanner;
public interface IMArticle {
public Article saisie();
public void affiche(Article a);
}

 class IMAmanager implements IMArticle{
	public Article saisie() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("saisir id ");
		int id=scanner.nextInt();
		
		System.out.println("saisir le libelle ");
		String lib=scanner.nextLine();
		
		return new Article(id,lib);
	}
	
	public void affiche(Article a) {
		 System.out.println("l id est: "+a.getId());
		 System.out.println("le libelle est: "+a.getLib());
	}
}
