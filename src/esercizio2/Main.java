package esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM SIM1 = new SIM("3344769854");
        SIM1.stampaSIM();
        SIM1.aggiungiNumero("211");
        SIM1.stampaSIM();
        SIM1.aggiungiNumero("233");
        SIM1.stampaSIM();
        SIM1.aggiungiNumero("245");
        SIM1.stampaSIM();
        SIM1.aggiungiNumero("211");
        SIM1.stampaSIM();
        SIM1.aggiungiNumero("244");
        SIM1.stampaSIM();

        Chiamata.StampaUltimeChiamateConDurataeNumeroChiamato();

    }
}
