package it.unitn.disi.lingProg.stellaDaniele.esame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class KeyEventHandler implements EventHandler<KeyEvent> {
    private static Shop shop;

    public KeyEventHandler(Shop shop) {
        this.shop = shop;
    }

    public KeyEventHandler() {
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        System.out.println("I'm hereeee");
        String c = keyEvent.getCharacter();
        switch (c) {
            case "a":
            case "A":
                shop.accessori.fireEvent(new ActionEvent());
                break;
            case "b":
            case "B":
                shop.binari.fireEvent(new ActionEvent());
                break;
            case "r":
            case "R":
                shop.rotabili.fireEvent(new ActionEvent());
                break;
        }
        keyEvent.consume();
    }
}
