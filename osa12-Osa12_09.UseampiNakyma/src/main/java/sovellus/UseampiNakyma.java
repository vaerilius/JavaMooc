package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        Application.launch(UseampiNakyma.class);
    }

    @Override
    public void start(Stage w) {

        BorderPane eka = new BorderPane();
        Label text = new Label("Eka näkymä!");
        Button tokaan = new Button("Tokaan näkymään!");
        eka.setCenter(tokaan);
        eka.setTop(text);
        Scene ekaScene = new Scene(eka);

        VBox toka = new VBox();
        Button kolmanteen = new Button("Kolmanteen näkymään!");
        Label text2 = new Label("Toka näkymä!");
        Scene tokaScene = new Scene(toka);
        toka.getChildren().addAll(kolmanteen, text2);

        GridPane kolmas = new GridPane();
        Button ekaan = new Button("Ekaan näkymään!");

        kolmas.add(new Label("Kolmas näkymä!"), 0, 0);
        kolmas.add(ekaan, 1, 1);
        Scene kolmasScene = new Scene(kolmas);

        ekaan.setOnAction((event) -> {

            w.setScene(ekaScene);
        });

        tokaan.setOnAction((event) -> {
            w.setScene(tokaScene);
        });

        kolmanteen.setOnAction((event) -> {
            w.setScene(kolmasScene);
        });

        w.setScene(ekaScene);
        w.show();
    }
}
