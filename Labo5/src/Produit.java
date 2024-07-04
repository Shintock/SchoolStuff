public class Produit {
    private double prixUnitaire;
    private String reference,designation;
    public Produit() {
        this.reference = "";
        this.designation = "";
        this.prixUnitaire = 1;
    }

    public Produit(String reference, String designation, double prixUnitaire) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
    }

    public Produit(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = 1;
    }

    public String getReference() {
        return reference;
    }
    public String getDesignation() {
        return designation;
    }
    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    public String toString(){
        return "Reference: " + reference + ", Designation: " + designation + ", Prix Unitaire: " + prixUnitaire;
    }
    public void comparerReference(Produit a1, Produit b1) {
        if (a1.reference.equals(b1.reference)) {
            System.out.print("Ces deux produits ont la meme reference");
        }
        else {
            System.out.print("Ces deux produits n'ont pas la meme reference");
        }
    }
}
