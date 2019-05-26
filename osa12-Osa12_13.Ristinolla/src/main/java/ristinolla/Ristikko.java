package ristinolla;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Ristikko {

    public Parent getView() {
        GridPane view = new GridPane();
   
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
              
                view.add(button, i, j);
              
            }

        }
             view.setAlignment(Pos.CENTER);
             view.setHgap(10);
             view.setVgap(10);

        return view;
    }

}
