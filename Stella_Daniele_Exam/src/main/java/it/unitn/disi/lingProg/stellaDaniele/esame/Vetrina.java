package it.unitn.disi.lingProg.stellaDaniele.esame;

import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Prodotto;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.LinkedList;

public class Vetrina extends Stage {
    private LinkedList<Prodotto> prodottiInVetrina = new LinkedList<>();
    private HBox hBoxProdotti = new HBox();
    private Dettaglio finestraDettagli = new Dettaglio();

    Vetrina() {
        Scene scene = new Scene(hBoxProdotti, 600, 200);
        setScene(scene);
        setTitle("Vetrina");
        setX(300);
        setY(100);
        this.addEventFilter(KeyEvent.KEY_TYPED, new KeyEventHandler());
        mostra();
    }

    void mostra() {
        show();
    }

    void aggiungiProdottiEMostra(LinkedList<Prodotto> prodottiPerVetrina) {
        prodottiInVetrina.clear();
        hBoxProdotti.getChildren().clear();
        prodottiInVetrina.addAll(prodottiPerVetrina);

        for (Prodotto p : prodottiInVetrina) {

            BorderPane borderPane = new BorderPane();

            Label nome = new Label(p.getNome());
            nome.setAlignment(Pos.CENTER);
            nome.setTextFill(Color.RED);
            nome.setFont(new Font(22));

            Image image = new Image("file:immagini/" + p.getNomeFile(), 200, 200, true, true);
            ImageView iw = new ImageView(image);

            Label prezzo = new Label(Integer.toString(p.getPrezzo()) + "Euro");
            prezzo.setAlignment(Pos.CENTER);
            prezzo.setTextFill(Color.BLUE);

            borderPane.setTop(nome);
            BorderPane.setAlignment(nome, Pos.CENTER);
            borderPane.setCenter(iw);
            borderPane.setBottom(prezzo);
            BorderPane.setAlignment(prezzo, Pos.CENTER);

            hBoxProdotti.getChildren().add(borderPane);

            borderPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    finestraDettagli.aggiungiEMostra(p);
                }
            });
        }
        mostra();
    }
}
