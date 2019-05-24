package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Tekstitilastointia");

        BorderPane grid = new BorderPane();

        HBox tekstit = new HBox();
        tekstit.setSpacing(5);
        Label kirjaimia = new Label("Kirjaimia: 0");

        Label sanoja = new Label("Sanoja: 0");

        Label pisinSana = new Label("Pisin sana on: ");

        tekstit.getChildren().add(kirjaimia);
        tekstit.getChildren().add(sanoja);
        tekstit.getChildren().add(pisinSana);

        grid.setBottom(tekstit);

        TextArea area = new TextArea();
        area.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {

            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanojaa = palat.length;

            String[] maara = kirjaimia.getText().split(" ");
            String[] sanatPaloina = sanoja.getText().split(" ");

            kirjaimia.setText(maara[0] + " " + merkkeja);
            sanoja.setText(sanatPaloina[0] + " " + sanojaa);

            String[] pisinOsat = pisinSana.getText().split(" ");
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            pisinSana.setText(pisinOsat[0] + " " + pisinOsat[1] + " " + pisinOsat[2] + " " + pisin);

        });

        grid.setCenter(area);

        Scene view = new Scene(grid);
        window.setScene(view);

        window.show();
    }

}
