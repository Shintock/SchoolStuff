package Exercice2;

public class FilePalindrome {
    private int nbElement;
    private int premier;
    private int dernier;
    private String[] donnees;

    public FilePalindrome() {
        donnees = new String[10];
        premier = 0;
        dernier = this.donnees.length;
        nbElement = this.donnees.length;
    }

    public FilePalindrome(int taille) {
        donnees = new String[taille];
        premier = 0;
        dernier = 0;
        nbElement = 0;
    }

    public boolean enfiler(String lettre) {
        if (taille() < donnees.length) {
            donnees[dernier] = lettre;
            dernier = (dernier+1)%donnees.length;
            nbElement++;
            return true;
        }
        return false;
    }

    public String defiler() {
        if (taille() > 0) {
            String element = donnees[premier];
            donnees[premier] = null;
            premier = (premier+1)%donnees.length;
            nbElement++;
            return element;
        }
        return null;
    }

    public int taille() {
        return nbElement;
    }

    public String debut(){
        return donnees[premier];
    }

    public void afficherFile() {
        for (int i = 0; i < donnees.length; i++) {
            System.out.print(donnees[i] + " ");
        }
    }

}
