package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class NappiJaTekstikenttaSovellus extends Application {

    @Override
    public void start(Stage window) {
        window.setTitle("App");
        TextField t = new TextField("text");
        Button b = new Button("button");
        

        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(b);
        pane.getChildren().add(t);

        Scene s = new Scene(pane);
        window.setScene(s);

        window.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }



}
