package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int numeroPezziDisponibili;

    public Articolo(String cA, String dA, int p, int nPD) {
        this.codiceArticolo = cA;
        this.descrizioneArticolo = dA;
        this.prezzo = p;
        this.numeroPezziDisponibili = nPD;
    }

    public void stampaArticolo() {
        System.out.println("Codice: " + codiceArticolo);
        System.out.println("Descrizione: " + descrizioneArticolo);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("NumeroPezzi: " + numeroPezziDisponibili);
    }

    public int getPrezzo() {
        return prezzo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }
}
