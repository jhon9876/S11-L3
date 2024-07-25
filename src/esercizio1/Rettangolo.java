package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double a, double l) {
        this.altezza = a;
        this.larghezza = l;
    }

    public static void stampaRettangolo(Rettangolo ret1) {
        double perimetro = altezza + larghezza;
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

    }

    public static void stampaDueRettangoli() {


    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
}
