public class Client {
    private String nom, telephone;
    public Client() {
        nom = "ETS inc";
        telephone = "514-396-8800";
    }
    public Client(String nom, String telephone){
        this.nom = nom;
        this.telephone = telephone;
    }
    public String getNom() {
        return nom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String toString() {
        return "Nom: " + nom + ", Numero de telephone: " + telephone;
    }
}
