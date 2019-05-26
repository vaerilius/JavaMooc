package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {

    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }

    @Override
    public void start(Stage w) throws Exception {
        BorderPane grid = new BorderPane();

        HBox nav = new HBox();
        nav.setPadding(new Insets(20, 20, 20, 20));
        nav.setSpacing(10);

        Button vitsi = new Button("Vitsi");
        Label kysymys = new Label("What do you call a bear with no teeth?");
        Button vastaus = new Button("Vastaus");
        Button selitys = new Button("Selitys");

        vitsi.setOnAction((event) -> {
            kysymys.setText("What do you call a bear with no teeth?");
        });
        vastaus.setOnAction((event) -> {
            kysymys.setText("A gummy bear.");
        });
        selitys.setOnAction((event) -> {
            kysymys.setText("he heh heh");
        });

        nav.getChildren().addAll(vitsi, vastaus, selitys);

        grid.setTop(nav);
        grid.setCenter(kysymys);

        Scene view = new Scene(grid);

        w.setScene(view);
        w.setWidth(300);
        w.setHeight(200);
        w.show();

    }
}
