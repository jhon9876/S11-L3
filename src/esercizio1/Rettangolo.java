package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double a, double l) {
        this.altezza = a;
        this.larghezza = l;
    }

    public static void stampaRettangolo(Rettangolo ret1) {
        double perimetro = ret1.altezza * 2 + ret1.larghezza * 2;
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        double area = ret1.getAltezza() * ret1.getLarghezza();
        System.out.println("L'area del rettangolo è: " + area);

    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        double perimetro1 = ret1.altezza * 2 + ret1.larghezza * 2;
        System.out.println("Il perimetro del primo rettangolo è: " + perimetro1);
        double area1 = ret1.getAltezza() * ret1.getLarghezza();
        System.out.println("L'area del primo rettangolo è: " + area1);
        double perimetro2 = ret2.altezza * 2 + ret2.larghezza * 2;
        System.out.println("Il perimetro del secondo rettangolo è: " + perimetro2);
        double area2 = ret2.getAltezza() * ret2.getLarghezza();
        System.out.println("L'area del secondo rettangolo è: " + area2);
        System.out.println("La somma dei perimetri è: " + (perimetro1 + perimetro2));
        System.out.println("La somma delle aree è: " + (area1 + area2));

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
