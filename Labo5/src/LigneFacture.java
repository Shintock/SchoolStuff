public class LigneFacture {
    private Produit produit;
    private int quantite;
    public LigneFacture(Produit produit) {
        this.produit = produit;
        quantite = 1;
    }
    public LigneFacture(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }
    public String toString() {
        return "Reference du produit: " + produit.getReference() + ", Designation du produit: " + produit.getDesignation() + ", Prix du produit: " + produit.getPrixUnitaire() + ", Quantite: " + quantite;
    }
    public void setProduit(Produit produit){
        this.produit = produit;
    }
    public Produit getProduit() {
        return produit;
    }

    public double montantHorsTaxes() {
        return (produit.getPrixUnitaire()*0.85025) ;
    }
}
