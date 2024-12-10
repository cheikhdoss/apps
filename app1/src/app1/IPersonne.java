package app1;

import java.util.Scanner;

import app1.personne;

public interface IPersonne {
public void saisie();
public void affiche();

}

class IMEtudiant implements IPersonne
{
	private etudiant Etudiant1;
	
public void saisie()
{
	 Etudiant1 =etudiant.etudiantSaisi();
	Etudiant1.ajout();

}

public void affiche()
{
	Etudiant1.affiche();
	Etudiant1.moy();
}


}

class IMEmploye implements IPersonne
{
	private employe Employe1;
	
	public void saisie()
	{
		Employe1.saisie();
	}
	
	public void affiche()
	{
		Employe1.employeAffiche();
	}

}


