//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Demonstration Exercice 1
        Produit a1 = new Produit();
        Produit b1 = new Produit("Elephant", "squirrel", 15);
        System.out.println(b1.getReference());
        System.out.println(b1.getDesignation());
        System.out.println(b1.getPrixUnitaire());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        a1.setReference("elephant");
        a1.setDesignation("tomate");
        a1.setPrixUnitaire(15);
        System.out.println(a1.toString());
        a1.comparerReference(a1,b1);

        //Demonstration Exercice 2
        Client c1 = new Client();
        Client c2 = new Client("Afshin", "514-378-5815");
        System.out.println("\n" + c1.toString());
        c1.setNom("Stephane Duvas");
        System.out.println(c1.toString());
        System.out.println(c1.getNom());
        c1.setTelephone("514-905-6554");
        System.out.println(c1.getTelephone());

        //Demonstation Exercice 3
        LigneFacture ligne1 = new LigneFacture(a1,12);
        LigneFacture ligne = new LigneFacture(b1);
        System.out.println(ligne.toString());
        System.out.println(ligne1.toString());
        System.out.println(ligne1.montantHorsTaxes());



    }
}