package esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM SIM1 = new SIM("3344769854");
        Chiamata ch1 = new Chiamata("23454", 60);
        Chiamata ch2 = new Chiamata("23454", 60);
        Chiamata ch3 = new Chiamata("23454", 60);
        Chiamata ch4 = new Chiamata("23454", 60);
        Chiamata ch5 = new Chiamata("23454", 60);
        Chiamata[] ultimeChiamate = {ch1, ch2, ch3, ch4, ch5};

        SIM1.setChiamate(ultimeChiamate);
        SIM1.stampaSIM();

        /*Chiamata.StampaUltimeChiamateConDurataeNumeroChiamato();*/

    }
}
