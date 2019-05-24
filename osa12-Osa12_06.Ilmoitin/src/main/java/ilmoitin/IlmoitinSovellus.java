package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application {
    
    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }
    
    @Override
    public void start(Stage w) {
        TextField field = new TextField();
        Button button = new Button("Päivitä");
        Label text = new Label();
        
        button.setOnAction((event) -> {
            text.setText(field.getText());
        });
        
        VBox box = new VBox();
        box.getChildren().addAll(field, button, text);
        
        w.setScene(new Scene(box));
        
        w.show();
    }
    
}
