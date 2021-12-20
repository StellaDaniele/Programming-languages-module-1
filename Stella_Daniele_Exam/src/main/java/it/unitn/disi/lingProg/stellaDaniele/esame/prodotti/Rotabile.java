package it.unitn.disi.lingProg.stellaDaniele.esame.prodotti;

public class Rotabile extends Prodotto {
    private int assiMotori;

    public Rotabile(String nome, String nomeFile, String descrizione, int prezzo, int assiMotori) {
        super(nome, nomeFile, descrizione, prezzo);
        this.assiMotori = assiMotori;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nAssi Motori: " + assiMotori;
        return str;
    }
}
