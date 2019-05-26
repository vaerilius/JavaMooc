package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SanaharjoitteluSovellus extends Application {
    
    private Sanakirja sanakirja;
    
    @Override
    public void init() throws Exception {
        this.sanakirja = new Sanakirja();
    }
    
    public static void main(String[] args) {
        launch(SanaharjoitteluSovellus.class);
    }
    
    @Override
    public void start(Stage window) throws Exception {
        
        Syottonakyma syottonakyma = new Syottonakyma(sanakirja);
        Harjoittelunakyma harjoittelunakyma = new Harjoittelunakyma(sanakirja);
        
        BorderPane grid = new BorderPane();
        HBox nav = new HBox();
        nav.setPadding(new Insets(20, 20, 20, 20));
        nav.setSpacing(10);
        
        Button lisaaSanoja = new Button("Lisää sanoja");
        Button harjoittele = new Button("Harjoittele");
        
        nav.getChildren().addAll(lisaaSanoja, harjoittele);
        grid.setTop(nav);
        grid.setCenter(syottonakyma.getView());
        
        lisaaSanoja.setOnAction(e -> grid.setCenter(syottonakyma.getView()));
        harjoittele.setOnAction((e) -> {
            grid.setCenter(harjoittelunakyma.getView());
        });
        Scene view = new Scene(grid, 400, 300);
        window.setScene(view);
        window.show();
        
    }
}
