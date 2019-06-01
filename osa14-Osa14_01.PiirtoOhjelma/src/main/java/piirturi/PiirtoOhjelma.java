package piirturi;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PiirtoOhjelma extends Application {

    public void start(Stage stage) {
        final int leveys = 640;
        final int korkeus = 480;

        stage.setTitle("Piirto-ohjelma");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas piirtoalusta = new Canvas(leveys, korkeus);
        root.getChildren().add(piirtoalusta);

        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        int[][] piirrettavaAlue = new int[leveys][korkeus];

        scene.setOnMouseClicked((MouseEvent e) -> {
            // tehdään jotain kun hiirtä klikataan
            int x = (int) e.getX();
            int y = (int) e.getY();

            piirrettavaAlue[x][y] = 1;
            // aseta piirrettävän koordinaatteihin x, y arvo 1
        });

        scene.setOnMouseDragged((MouseEvent e) -> {
            // tehdään jotain kun nappi pohjassa olevaa hiirtä siirretään
            int x = (int) e.getX();
            int y = (int) e.getY();
            piirrettavaAlue[x][y] = 1;

            // aseta piirrettävän koordinaatteihin x, y arvo 1
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                piirturi.setFill(Color.WHITE);
                piirturi.clearRect(0, 0, leveys, korkeus);

                piirturi.setFill(Color.BLACK);
                                             piirturi.clearRect(0, 0, leveys, korkeus);


                // komento 
                // piirturi.fillRect(x, y, 2, 2);
                // piirtää 2 x 2-kokoisen neliön kohtaan x, y
                for (int i = 0; i < piirrettavaAlue.length; i++) {
                    for (int j = 0; j < piirrettavaAlue[i].length; j++) {
                        if (piirrettavaAlue[i][j] == 1) {
                             piirturi.fillRect(i, j, 2, 2);
                        }
                    }

                }

                // toteuta tänne toistolause, joka käy koko kaksiulotteisen
                // taulukon läpi, ja piirtää jokaisen alkion kohdalla, missä
                // arvo on 1
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
