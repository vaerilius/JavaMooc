package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application{


    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }

    @Override
    public void start(Stage w) throws Exception {
        Label teksti = new Label("Kirjoita nimesi ja aloita.");
        TextField field = new TextField();
        Button button = new Button("Aloita");
        
        GridPane grid = new GridPane();
        
        grid.setPrefSize(300, 180);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        grid.add(teksti, 0, 0);
        grid.add(field, 0, 1);
        grid.add(button, 0, 2);
        
        Scene view = new Scene(grid);
        
        StackPane stack = new StackPane();
         Label tervetuloaTeksti = new Label("Tervetuloa ");
         stack.setPrefSize(300, 180);
         stack.getChildren().add(tervetuloaTeksti);
         stack.setAlignment(Pos.CENTER);
        
        Scene view2 = new Scene(stack);
        
        button.setOnAction((event) -> {
            tervetuloaTeksti.setText("Tervetuloa " + field.getText() + "!");
            w.setScene(view2);
        });
        
        w.setScene(view);
        
        w.show();
        
        
    }
}
