module it.unitn.disi.lingProg.stellaDaniele.esame {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unitn.disi.lingProg.stellaDaniele.esame to javafx.fxml;
    exports it.unitn.disi.lingProg.stellaDaniele.esame;
}