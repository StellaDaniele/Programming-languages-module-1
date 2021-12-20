package it.unitn.disi.lingProg.stellaDaniele.esame.prodotti;

abstract public class Prodotto {
    private String nome;
    private int prezzo;
    private String descrizione;
    private String nomeFile;

    Prodotto(String nome, String nomeFile, String descrizione, int prezzo) {
        this.nome = nome;
        this.nomeFile = nomeFile;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNomeFile() {
        return nomeFile;
    }

    @Override
    public String toString() {
        return "Prezzo: " + prezzo + " Euro" +
                "\nDescrizione: " + descrizione;
    }
}
