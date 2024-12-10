package app2;

public class Produit {
private String ref;
private String libelle;
private double quantite;
private int prix;
//constructeur avec argumment

//debut
Produit(String ref,String libelle,double quantite,int prix){
this.ref=ref;
this.libelle=libelle;
this.quantite=quantite;
this.prix=prix;

}
//fin

//methode get qui retourne l attribut 

public String getRef()
{
	
	return ref;
	}

public String getLibelle()
{
	
	return libelle;
	}

public double getQuantite()
{
	
	return quantite;
	}

public int getPrix()
{
	
	return prix;
	}




}
