package it.unitn.disi.lingProg.stellaDaniele.esame;

import it.unitn.disi.lingProg.stellaDaniele.esame.prodotti.Prodotto;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Dettaglio extends Stage {
    private BorderPane borderPane = new BorderPane();

    Dettaglio() {
        Scene scene = new Scene(borderPane, 600, 400);
        setScene(scene);
        setTitle("Dettaglio");
        setX(300);
        setY(325);
        this.addEventFilter(KeyEvent.KEY_TYPED, new KeyEventHandler());
        mostra();
    }

    void mostra() {
        show();
    }

    void aggiungiEMostra(Prodotto p) {
        borderPane.getChildren().clear();

        Label nome = new Label(p.getNome());
        nome.setAlignment(Pos.CENTER);
        nome.setTextFill(Color.RED);
        nome.setFont(new Font(22));

        Image image = new Image("file:immagini/" + p.getNomeFile(), 400, 400, true, true);
        ImageView iw = new ImageView(image);

        Label dettagli = new Label(p.toString());
        dettagli.setAlignment(Pos.BOTTOM_LEFT);

        borderPane.setTop(nome);
        BorderPane.setAlignment(nome, Pos.CENTER);
        borderPane.setCenter(iw);
        borderPane.setBottom(dettagli);
        BorderPane.setAlignment(dettagli, Pos.BOTTOM_LEFT);
    }
}
