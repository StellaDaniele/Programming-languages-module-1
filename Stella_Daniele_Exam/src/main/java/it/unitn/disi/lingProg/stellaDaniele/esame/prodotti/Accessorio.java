package it.unitn.disi.lingProg.stellaDaniele.esame.prodotti;

public class Accessorio extends Prodotto {
    private boolean conLuce;

    public Accessorio(String nome, String nomeFile, String descrizione, int prezzo, boolean conLuce) {
        super(nome, nomeFile, descrizione, prezzo);
        this.conLuce = conLuce;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\n" + ((conLuce) ? "Con " : "Senza ") + "luce";
        return str;
    }
}
