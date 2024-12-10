package app1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		 System.out.println("saisir le titre: ");
		String nom=scanner.nextLine();
		
		switch (nom)
		{
		case "etudiant":
			IMEtudiant imetudiant=new IMEtudiant();
			imetudiant.saisie();
			imetudiant.affiche();
			
			
			
			
			/*etudiant Etudiant1=etudiant.etudiantSaisi();
			Etudiant1.ajout();
			Etudiant1.affiche();
			Etudiant1.moy();*/
			break;
		case "employe":
			IMEmploye imemploye=new IMEmploye();
			 imemploye.saisie();
			 imemploye.affiche();
			
			break;
		default :
			System.out.println("saisie incorrect");
			break;
		}
		

	}

}
