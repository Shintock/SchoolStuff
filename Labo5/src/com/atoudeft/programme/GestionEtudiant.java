package com.atoudeft.programme;


import java.util.Locale;
import java.util.Scanner;

public class GestionEtudiant {

	static Scanner clavier = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		clavier.useLocale(Locale.ENGLISH);

		char choix = menu();
		while (choix != 'q')
		{
			switch (choix)
			{
			case 'a' :
				System.out.println("Choix afficher.");
				break;
			case 'c' :
				System.out.println("Choix modifier courriel.");
				break;
			case '+' :
				System.out.println("Choix ajouter une évaluation.");
				break;
			case 'm' :
				System.out.println("Choix modifier une note.");
				break;
			default :
				System.out.println("Choix invalide.");
			}
			choix = menu();
		}
		System.out.println("Bye Bye !");
	}

	private static char menu()
	{
		System.out.println("\n\n\ta. Afficher l'étudiant");
		System.out.println("\tc. Modifier le courriel");
		System.out.println("\t+. Ajouter une évaluation");
		System.out.println("\tm. Modifier une note");
		System.out.println("\tq. Quitter");

		System.out.print("\n\t\tVotre choix :");
		String rep = clavier.nextLine();
		char choix;
		if (rep.length()>0)
			choix = rep.charAt(0);
		else
			choix = 'x';
		return choix;
	}
}
