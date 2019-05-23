package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {

    @Override
    public void start(Stage window) {
        window.setTitle("App");
       TextField text = new TextField("put data");
        Button button = new Button("send data");

        FlowPane componets = new FlowPane();
        componets.getChildren().add(text);
        componets.getChildren().add(button);
        Scene view = new Scene(componets);
        window.setScene(view);

        window.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
