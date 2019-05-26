package sovellus;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Syottonakyma {

    private Sanakirja sanakirja;

    public Syottonakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
    }

    public Parent getView() {
        GridPane asettelu = new GridPane();

        Label sana = new Label("Sana");
        TextField sanaKentta = new TextField();
        Label kaannos = new Label("Käännös");
        TextField kaannosKentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));

        Button lisaanappi = new Button("Lisää sanapari");

        asettelu.add(sana, 0, 0);
        asettelu.add(sanaKentta, 0, 1);
        asettelu.add(kaannos, 0, 2);
        asettelu.add(kaannosKentta, 0, 3);
        asettelu.add(lisaanappi, 0, 4);

        lisaanappi.setOnMouseClicked(e -> {
            String lisattavaSana = sanaKentta.getText();
            String lisattavaKaannos = kaannosKentta.getText();
            sanakirja.lisaa(lisattavaSana, lisattavaKaannos);

            sanaKentta.clear();
            kaannosKentta.clear();

        });

        return asettelu;
    }

}
