public class Taxes {
    public static final double TPS = 0.05;
    public static final double TVQ = 0.09975;
    //Constructeur privé :
    private Taxes() {
    }
    //Services offerts par la classe :
    public static double getMontantTps(double montantHT) {
        return montantHT * TPS;
    }
    public static double getMontantTvq(double montantHT) {
        return montantHT * TVQ;
    }
    public static double getMontantTaxes(double montantHT) {
        return montantHT * (TPS+TVQ);
    }
    public static double getMontantTotal(double montantHT) {
        return montantHT * (1+TPS+TVQ);
    }
}