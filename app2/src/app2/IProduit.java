package app2;
import java.util.Scanner;


//utilisation d une interface ou l ensemble des methode saisi seront respect
//dans toute les autres classe ou l interface seras implementer

public interface IProduit {
	public Produit saisie();
	public void affiche(Produit  produit);//signifie afficher un objet de type Produit donner en parametre
	
}

 class IMProduit implements IProduit
{
	
	 
	public Produit saisie()//raccourcis pour pouvoir plus rapidement retourner un objet de Type Produit
     {
		//scanner pour effection des saisie au clavier
		 Scanner scanner = new Scanner(System.in);
		   System.out.println("la ref : ");
		   String ref = scanner.nextLine();//catch ce que l utilisateur a saisie et le mais dans la variable ref
		   
		   System.out.println("le libelle : ");
		   String libelle = scanner.nextLine();
		   
		   System.out.println("la quantite en (kg) : ");
		   double quantite = scanner.nextDouble();
		   
		   System.out.println("le prix : ");
		   int prix = scanner.nextInt();
		   
		 //return et creation d un nouvelle objet 
		   return new  Produit(ref,libelle,quantite,prix);
		   
     }
	 
     
     public void affiche(Produit produit)
     {
    	 //utilisation de la methode get a cause du modificateur d acces private
    	 System.out.println("la reference est: "+produit.getRef());
    	 System.out.println("le libelle est: "+produit.getLibelle());
    	 System.out.println("la quantite est :"+produit.getQuantite());
    	 System.out.println("le prix est: "+produit.getPrix());
    	 
    	 
     }
	 

	
	
	
	}
