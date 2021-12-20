package it.unitn.disi.lingProg.stellaDaniele.esame.prodotti;

public class Binario extends Prodotto {
    private int lunghezza;
    private int angolo;

    public Binario(String nome, String nomeFile, String descrizione, int prezzo, int lunghezza, int angolo) {
        super(nome, nomeFile, descrizione, prezzo);
        this.lunghezza = lunghezza;
        this.angolo = angolo;

    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nLunghezza: " + lunghezza
                + "\nAngolo: " + angolo;
        return str;
    }
}
