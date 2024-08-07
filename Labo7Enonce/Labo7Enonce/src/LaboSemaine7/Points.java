package Exercice3;

public class Points {
    private int abscisse;
    private int ordonnee;

    public static void main(String[] args) {

    }
    public Points() {
        abscisse = 0;
        ordonnee = 0;
    }

    public Points(int ordonnee) {
        abscisse = 0;
        this.ordonnee = ordonnee;
    }

    public Points(int ordonnee, int abscisse) {
        this.ordonnee = ordonnee;
        this.abscisse = abscisse;
    }

    public boolean comparerDesPoints(Points p1, Points p2) {
        if (p1.getAbscisse() == p2.getAbscisse() && p1.getOrdonnee() == p2.getOrdonnee()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "(" + abscisse + "," + ordonnee + ")";
    }

    public int getAbscisse(){
        return this.abscisse;
    }

    public int getOrdonnee(){
        return this.ordonnee;
    }

    public void setAbscisse(int abscisse){
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee){
        this.ordonnee = ordonnee;
    }

    public int mesurerDistance (Points p1, Points p2) {
        Points p3;
    }
}
