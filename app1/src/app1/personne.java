package app1;
import java.util.Scanner;
public class personne {
protected String nom;
protected String prenom;
 personne() {
}

personne(String nom,String prenom)
{
this.nom=nom;
this.prenom=prenom;

}

public void setNom()
{
this.nom=nom;	
}

public void setPrenom()
{
this.prenom=prenom;	
}

public String getNom()
{
	return nom;
}

public String getPrenom()
{
	return prenom;
}

public static personne personneSaisie()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("entrer le nom: ");
	String nom=scanner.nextLine();
	
	System.out.println("entrer le prenom: ");
	String prenom=scanner.nextLine();
	return new personne(nom,prenom);
}
public void personneAffiche()
{
	System.out.println("le nom est :"+nom);
	System.out.println("le prenom est :"+prenom);
}


public static void iPersonne()
{
	Scanner scanner = new Scanner (System.in);
	 System.out.println("saisir le titre: ");
	String nom=scanner.nextLine();
	
	switch (nom)
	{
	case "etudiant":
		etudiant Etudiant1=etudiant.etudiantSaisi();
		Etudiant1.ajout();
		Etudiant1.affiche();
		Etudiant1.moy();
		break;
	case "employe":
		
		employe Employe1 = employe.saisie();
		Employe1.employeAffiche();
		
		break;
	default :
		System.out.println("saisie incorrect");
		break;
	}
	
}


}

class employe extends personne
{
	private String fonction;
	private double salaire;
	
	public employe(String fonction, double salaire) {
		this.fonction=fonction;
		this.salaire=salaire;
	
	}
	public employe(String nom,String prenom,String fonction,double salaire)
	{
		super(nom,prenom);
		this.fonction=fonction;
		this.salaire=salaire;
	}
	
	public void setFonction()
	{
		this.fonction=fonction;
	}
	public String getFonction()
	{
		return fonction;
	}
	
	public void setSalaire()
	{
		this.salaire=salaire;
	}
	public double getSalaire()
	{
		return salaire;
	}
	
	public static employe saisie()
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("entrer le nom: ");
		String nom=scanner.nextLine();
		System.out.println("entrer le prenom: ");
		String prenom=scanner.nextLine();
		System.out.println("entrer la fonction: ");
		String fonction=scanner.nextLine();
		System.out.println("entrer le salaire: ");
		double salaire=scanner.nextDouble();
		
		return new employe(nom,prenom,fonction,salaire);
	}
	
	public void employeAffiche()
	{
		personneAffiche();
		System.out.println("la foction est: "+getFonction());
		System.out.println("le salaire est: "+getSalaire());
	}
	


}

class etudiant extends personne
{
	public final int MAX_NOTES=10;
	private String matricule;
	private double moyenne;
	private double[] tabnotes;
	private int nbNote;
	etudiant(String nom,String prenom,double moyenne)
	{
		super(nom,prenom);
		this.moyenne=moyenne;
		this.tabnotes=new double[MAX_NOTES];
		this.nbNote=0;
	}
	etudiant(String nom,String prenom)
	{
		super(nom,prenom);
		this.moyenne=moyenne;
		this.tabnotes=new double[MAX_NOTES];
		this.nbNote=0;
	}
	public void setNom()
	{
		this.nom=nom;
	}
	
	public void setPrenom()
	{
		this.prenom=prenom;
	}
	public String getNom()
	{
		return nom;
	}
	public String getPrenom()
	{
		return prenom;
	}
	public static etudiant etudiantSaisi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("saisir le nom: ");
		String nom=scanner.nextLine();
		System.out.println("saisir le prenom: ");
		String prenom=scanner.nextLine();
		
		return new etudiant(nom,prenom);
		
	}
	public void ajout()
	{
		for(int i=0;i<MAX_NOTES;i++) 
		{
			Scanner scanner =new Scanner(System.in);
			System.out.println("note"+(i+1));
		  int note =scanner.nextInt();
		  tabnotes[i]=note;
		  nbNote++;
		}
	}
	public double moy()
	{
		double som=0,moy;
		for (double note : tabnotes)
		{
			som += note;
		}
		moy=som/nbNote;
		System.out.println("la moyenne est de "+moy);
		return moy;
	}
	
	public void affiche()
	{
		System.out.println("le nom est :"+nom);
		System.out.println("le prenom est :"+prenom);
		for(int i=0;i<tabnotes.length;i++) 
		{
			System.out.println("note"+(i+1));
			System.out.println((tabnotes[i]));
		}
	}
	
}





