package esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(2, 5);
        System.out.println("La larghezza del primo rettangolo è: " + rettangolo1.getLarghezza());
        System.out.println("L'altezza del primo rettangolo è: " + rettangolo1.getAltezza());
        Rettangolo rettangolo2 = new Rettangolo(7, 3);
        System.out.println("La larghezza del secondo rettangolo è: " + rettangolo2.getLarghezza());
        System.out.println("L'altezza del secondo rettangolo è: " + rettangolo2.getAltezza());

        Rettangolo.stampaRettangolo(rettangolo1);
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}