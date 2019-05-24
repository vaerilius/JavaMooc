package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;


public class KayttajanOtsikko extends Application{

    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String header = params.getNamed().get("header");
        window.setTitle(header);
        window.show();
    }


}
