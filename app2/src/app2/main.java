package app2;

public class main {

	public static void main(String[] args) {
		IMProduit improduit= new IMProduit();
		Produit produit=improduit.saisie();
		improduit.affiche(produit);
		

	}

}
