package app3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("le genre d article montre ou chemise:");
        String choix=scanner.nextLine();
        
        switch (choix)
        {
        case "chemise":
        	IMChemise manager=new IMChemise();
        	//IMChemise ichemise= new IMChemise();
        	Chemise chemise =manager.saisie();
        	//Chemise chemise =ichemise.saisie();
        	manager.affiche(chemise);
        	
        	break;
        case "montre":
        	IMMontre immontre=new IMMontre();
        	Montre Montre = immontre.saisie();
        	immontre.affiche(Montre);
        	break;
        	default:System.out.println("saisi incorrect");
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
	}

}
