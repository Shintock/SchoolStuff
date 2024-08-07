package Exercice2;

public class palindrome {
    public static void main(String[] args) {
        String test = "tomate";
        if (!estUnPalindrome(test)) {
            System.out.println("Ceci n'est pas un palindrome");
        } else {
            System.out.println("Ceci est un palindrome");
        }
    }

    public static boolean estUnPalindrome(String mot) {
        String []str1;
        str1 = mot.split("");

        PilePalindrome p1 = new PilePalindrome(str1.length);
        FilePalindrome p2 = new FilePalindrome(str1.length);


        for (int i = 0; i < str1.length; i++) {
            p2.enfiler(str1[i]);
            p1.empiler(str1[i]);
        }
        for (int i = 0; i < str1.length; i++) {
            if (!p1.peek().equals(p2.debut())){
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
