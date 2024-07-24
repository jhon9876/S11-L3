package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double a, double l) {
        this.altezza = a;
        this.larghezza = l;
    }

    public static void stampaRettangolo() {
        Rettangolo rettangolo1 = new Rettangolo(5, 2);
        double area = rettangolo1.altezza * rettangolo1.larghezza;
        System.out.println("L'area del rettangolo è: " + area);

        double perimetro = rettangolo1.altezza * 2 + rettangolo1.larghezza * 2;
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

    }

    public static void stampaDueRettangoli() {
        Rettangolo rettangolo1 = new Rettangolo(5, 2);
        double area1 = rettangolo1.altezza * rettangolo1.larghezza;
        System.out.println("L'area del primo rettangolo è: " + area1);
        Rettangolo rettangolo2 = new Rettangolo(3, 4);
        double area2 = rettangolo2.altezza * rettangolo2.larghezza;
        System.out.println("L'area del secondo rettangolo è: " + area2);

        System.out.println("La somma delle aree dei due rettangoli è data da: " + (area1 + area2));

        double perimetro1 = rettangolo1.altezza * 2 + rettangolo1.larghezza * 2;
        System.out.println("Il perimetro del primo rettangolo è: " + perimetro1);
        double perimetro2 = rettangolo2.altezza * 2 + rettangolo2.larghezza * 2;
        System.out.println("Il perimetro del secondo rettangolo è: " + perimetro2);

        System.out.println("La somma dei perimetri dei due rettangoli è data da: " + (perimetro1 + perimetro2));

    }
}
