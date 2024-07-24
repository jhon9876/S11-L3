package esercizio3;

public class Cliente {
    static String codiceCliente;
    private String nome;
    private String cognome;
    private String dataIscrizione;

    public Cliente(String cC, String n, String c, String dI) {
        this.codiceCliente = cC;
        this.nome = n;
        this.cognome = c;
        this.dataIscrizione = dI;
    }
}
