package sovellukseni;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableRow;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Sovellukseni extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        ikkuna.setTitle("App");
        ikkuna.setHeight(300);
        ikkuna.setWidth(300);
        
        Button nappi = new Button("Tämä on nappi");
         Label tekstikomponentti = new Label("Tekstielementti");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        
        
        TreeTableView view = new TreeTableView();
        TreeTableColumn col = new TreeTableColumn("test");
        TreeTableColumn col2 = new TreeTableColumn("test2");
        TreeTableRow row1 = new TreeTableRow();

        row1.getBorder();
        
        view.getColumns().add(col);
        view.getColumns().add(col2);
        

   
         komponenttiryhma.getChildren().add(view);
         
        
        Hyperlink link = new Hyperlink("https://ohjelmointi-19.mooc.fi/osa-12/2-kayttoliittymakomponentit-ja-niiden-asettelu");
         komponenttiryhma.getChildren().add(link);

        komponenttiryhma.getChildren().add(tekstikomponentti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    public static void main(String[] args) {
        launch(Sovellukseni.class);
    }

}
