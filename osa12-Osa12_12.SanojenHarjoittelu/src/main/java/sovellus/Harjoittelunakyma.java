package sovellus;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Harjoittelunakyma {

    private Sanakirja sanakirja;
    private String arvottuSana;

    Harjoittelunakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
        this.arvottuSana = this.sanakirja.arvoSana();

    }

    public Parent getView() {
        GridPane asettelu = new GridPane();

        Label sana = new Label("Käännä sana '" + this.arvottuSana + "'");
        TextField sanaKentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));

        Button tarkista = new Button("Tarkista");
        Label palaute = new Label("");

        asettelu.add(sana, 0, 0);
        asettelu.add(sanaKentta, 0, 1);
        asettelu.add(tarkista, 0, 2);
        asettelu.add(palaute, 0, 3);

        tarkista.setOnMouseClicked(e -> {
            String tarkistettavaSana = sanaKentta.getText();
            if (sanakirja.hae(arvottuSana).equals(tarkistettavaSana)) {
                palaute.setText("Oikein!");
            } else {
                palaute.setText("Väärin! Sanan '" + arvottuSana + "' käännös on '" + sanakirja.hae(arvottuSana) + "'.");
                return;
            }
            this.arvottuSana = this.sanakirja.arvoSana();
            sana.setText("Käännä sana '" + this.arvottuSana + "'");
            sanaKentta.clear();

        });

        return asettelu;
    }

}
