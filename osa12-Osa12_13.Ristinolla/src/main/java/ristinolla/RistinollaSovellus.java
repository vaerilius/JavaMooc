package ristinolla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application{


    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        Ristikko ristikko = new Ristikko();
        BorderPane grid = new BorderPane();
     
        grid.setPadding(new Insets(20, 20, 20, 20));
         
        
        Label text = new Label("Vuoro: ");
        text.setFont(Font.font("Monospaced", 40));
        
        
        grid.setTop(text);
        grid.setCenter(ristikko.getView());
        Scene view = new Scene(grid, 480, 370);
        
        window.setScene(view);
        window.show();
    }

}
