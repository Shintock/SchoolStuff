package Exercice2;

public class PilePalindrome {
    String[] donnees;
    private int nbElement;
    private int sommet;

    public PilePalindrome() {
        donnees = new String[10];
        nbElement = 0;
        sommet = 0;
    }

    public PilePalindrome(int taille) {
        donnees = new String[taille];
        nbElement = 0;
        sommet = 0;
    }

    public boolean estVide() {
        if (nbElement == 0) {
            return true;
        }
        return false;
    }

    public boolean empiler (String lettre) {
        if (taille() < donnees.length){
            donnees[sommet] = lettre;
            sommet++;
            nbElement++;
            return true;
        }
        return false;
    }

    public String depiler() {
        if (taille() > 0) {
            String element = donnees[sommet-1];
            donnees[sommet-1] = null;
            sommet--;
            nbElement--;
            return element;
        }
        return null;
    }

    public int taille(){
        return nbElement;
    }

    public String peek() {
        return donnees[sommet-1];
    }

    public void afficherPile() {
        for (int i = 0; i < donnees.length; i++) {
            System.out.print(donnees[i] + " ");
        }
    }
}
