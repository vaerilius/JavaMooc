package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    public static void main(String[] args) {
        launch(HymioSovellus.class, args);
    }

    @Override
    public void start(Stage window) throws Exception {

        Canvas canvas = new Canvas(400, 400);
        BorderPane borderPane = new BorderPane();
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        ColorPicker colorPicker = new ColorPicker(Color.BLACK);
        graphicsContext.setFill(colorPicker.getValue());

        graphicsContext.fillRect(canvas.getWidth() / 6 + 50, 75, 50, 50);
        graphicsContext.fillRect(canvas.getWidth() / 6 + 200, 75, 50, 50);

        graphicsContext.fillRect(canvas.getWidth() / 6 , 200, 50, 50);
        graphicsContext.fillRect(canvas.getWidth() / 6 + 250, 200, 50, 50);

        graphicsContext.fillRect(canvas.getWidth() / 6 + 50, 250, 50, 50);
        graphicsContext.fillRect(canvas.getWidth() / 6 + 100, 250, 50, 50);
        graphicsContext.fillRect(canvas.getWidth() / 6 + 150, 250, 50, 50);
        graphicsContext.fillRect(canvas.getWidth() / 6 + 200, 250, 50, 50);

        borderPane.setCenter(canvas);

        Scene scene = new Scene(borderPane);
        window.setScene(scene);

        window.show();
    }

}
