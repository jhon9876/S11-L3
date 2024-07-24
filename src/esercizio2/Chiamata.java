package esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String num, int d) {
        this.numeroChiamato = num;
        this.durata = d;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numeroChiamato='" + numeroChiamato + '\'' +
                ", durata=" + durata +
                '}';
    }

    /*public static void StampaUltimeChiamateConDurataeNumeroChiamato() {
        for (int i = 0; i < SIM.chiamate.length; i++) {
            Chiamata ch = new Chiamata("321", 20);
            *//*System.out.println("Il numero della SIM è: " + SIM.chiamate[i]);*//*
            System.out.println("Numero chiamato: " + ch.numeroChiamato + " Durata: " + ch.durata);
        }
    }*/
}
