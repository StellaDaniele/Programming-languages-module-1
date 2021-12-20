package it.unitn.disi.lingProg.stellaDaniele.esame;

import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Accessorio;
import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Binario;
import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Prodotto;
import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Rotabile;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.LinkedList;

public class Shop extends Application {
    static final int NUMERO_PRODOTTI_IN_VETRINA = 3;
    final LinkedList<Prodotto> prodotti = new LinkedList<>();
    Button rotabili = new Button("Rotabili");
    Button binari = new Button("Binari");
    Button accessori = new Button("Accessori");
    KeyEventHandler keyEventHandler = new KeyEventHandler(this);

    @Override
    public void start(Stage stage) throws Exception {
        inserisciOggetti();
        creaEMostraShop(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }


    void inserisciOggetti() {
        prodotti.add(new Rotabile("Locomotiva", "locomotiva.jpg", "Blah blah...", 50, 3));
        prodotti.add(new Rotabile("Vagone passeggeri", "passeggeri.jpg", "blah, blah...", 20, 0));
        prodotti.add(new Rotabile("Vagone merci", "merci.jpg", "blah,blah, ...", 10, 0));

        prodotti.add(new Accessorio("Stazione", "stazione.jpg", "blah blah...", 30, true));
        prodotti.add(new Accessorio("Ponte", "ponte.jpg", "Blah blah...", 20, false));
        prodotti.add(new Accessorio("Castello", "castello.jpg", "Blah blah...", 25, false));

        prodotti.add(new Binario("Binario Diritto", "diritto.jpg", "Blah blah...", 2, 12, 0));
        prodotti.add(new Binario("Binario Curvo", "curvo.jpg", "Blah blah...", 3, 15, 30));
        prodotti.add(new Binario("Scambio Destro", "scambio.jpg", "Blah blah...", 10, 12, 15));
    }

    void creaEMostraShop(Stage stage) {
        Vetrina v = new Vetrina();
        LinkedList<Prodotto> prodottiPerVetrina = new LinkedList<>();

        rotabili.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent mouseEvent) {
                prodottiPerVetrina.clear();
                for (Prodotto p : prodotti) {
                    if (prodottiPerVetrina.size() >= 3)
                        break;
                    if (p instanceof Rotabile)
                        prodottiPerVetrina.add(p);
                }
                v.aggiungiProdottiEMostra(prodottiPerVetrina);
            }
        });

        binari.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent mouseEvent) {
                prodottiPerVetrina.clear();
                for (Prodotto p : prodotti) {
                    if (prodottiPerVetrina.size() >= 3)
                        break;
                    if (p instanceof Binario)
                        prodottiPerVetrina.add(p);
                }
                v.aggiungiProdottiEMostra(prodottiPerVetrina);
            }
        });

        accessori.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent mouseEvent) {
                prodottiPerVetrina.clear();
                for (Prodotto p : prodotti) {
                    if (prodottiPerVetrina.size() >= 3)
                        break;
                    if (p instanceof Accessorio)
                        prodottiPerVetrina.add(p);
                }
                v.aggiungiProdottiEMostra(prodottiPerVetrina);
            }
        });
        HBox bottoni = new HBox(rotabili, binari, accessori);
        bottoni.setSpacing(20);

        Scene scene = new Scene(bottoni, 220, 30);
        stage.setScene(scene);
        stage.setTitle("Shop di Stella Daniele");
        stage.setX(70);
        stage.setY(100);
        stage.addEventFilter(KeyEvent.KEY_TYPED, keyEventHandler);
        stage.show();
    }
}
