public class Facture {
    private Client client = new Client();
    private LigneFacture[] ligne;
    private int compteur = 0;
    public Facture(int nombreMax) {
        this.ligne = new LigneFacture[nombreMax];
    }
    public Facture() {
        this.ligne = new LigneFacture[10];
    }
    public Facture (Client client, int nombreMax) {
        this.ligne = new LigneFacture[nombreMax];
        this.client = client;
    }
    public Facture(String nom, String telephone,int nombreMax) {
        client.setNom(nom);
        client.setTelephone(telephone);
        this.ligne = new LigneFacture[nombreMax];
    }
    public boolean ajouterLigneFacture(LigneFacture nouvelLigne) {
        if (compteur < ligne.length) {
            ligne[compteur] = nouvelLigne;
            compteur++;
            return true;
        }
        return false;
    }

    public LigneFacture[] supprimerLigneFacture(String numReference) {
        int i,j;
        for ( i=0; i < compteur; i++){
            if (ligne[i].getProduit().getReference().equals(numReference)) {
                for( j=i; j < compteur; j++){
                    ligne[j].setProduit(ligne[j+1].getProduit());
                }
                ligne[compteur].setProduit(null);
            }
        }
        return ligne;
    }

    public void afficherFacture(LigneFacture[] ligne) {
        System.out.println("Voici votre facture: ");
        for(int i = 0; i < compteur; i++) {
            System.out.println(ligne[i].toString());
        }
    }

    

}
