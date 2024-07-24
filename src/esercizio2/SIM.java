package esercizio2;

import java.util.Arrays;

public class SIM {
    static String[] chiamate;
    private String numero;
    private int credito;
    private int counter;

    public SIM(String num) {
        this.numero = num;
        this.credito = 0;
        this.counter = 0;
        this.chiamate = new String[5];
    }


    public void stampaSIM() {
        System.out.println("Il numero della SIM è: " + numero);
        System.out.println("Il credito è: " + credito);
        System.out.println("Le ultime chiamate effettuate sono: " + Arrays.toString(chiamate));

    }

    public void aggiungiNumero(String n) {

        if (counter != chiamate.length) {
            chiamate[counter] = n;
            counter++;
        } else {
            System.out.println("Segreteria piena");
        }
    }
}
