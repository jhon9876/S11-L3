package esercizio3;

public class Carrello {
    private String clienteAssociato;
    private String[] elencoArticoli;
    private int totaleCostoArticoli;

    public Carrello(String[] eA, int tcA) {
        clienteAssociato = Cliente.codiceCliente;
        this.elencoArticoli = eA;
        this.totaleCostoArticoli = tcA;
    }
}
