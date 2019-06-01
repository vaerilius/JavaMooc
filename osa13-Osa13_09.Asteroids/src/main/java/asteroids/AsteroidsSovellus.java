package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsSovellus extends Application {

    public static int LEVEYS = 300;
    public static int KORKEUS = 200;

    public static void main(String[] args) {
        launch(AsteroidsSovellus.class);
    }

    public static int osiaToteutettu() {
        return 4;
    }

    @Override
    public void start(Stage stage) throws Exception {

        Pane ruutu = new Pane();
        Text text = new Text(10, 20, "Points: 0");
        ruutu.getChildren().add(text);

        AtomicInteger pisteet = new AtomicInteger();

        ruutu.setPrefSize(LEVEYS, KORKEUS);

        Alus alus = new Alus(LEVEYS / 2, KORKEUS / 2);

        List<Asteroidi> asteroidit = new ArrayList<>();
        List<Ammus> ammukset = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            Asteroidi asteroidi = new Asteroidi(random.nextInt(LEVEYS / 3), random.nextInt(KORKEUS / 3));
            asteroidit.add(asteroidi);
        }
        ruutu.getChildren().addAll(alus.getHahmo());
        asteroidit.forEach(astereoidi -> ruutu.getChildren().add(astereoidi.getHahmo()));

        Scene scene = new Scene(ruutu);
        stage.setTitle("Asteroids!");

        Map<KeyCode, Boolean> painetutNapit = new HashMap<>();

        scene.setOnKeyPressed(e -> painetutNapit.put(e.getCode(), Boolean.TRUE));
        scene.setOnKeyReleased(e -> painetutNapit.put(e.getCode(), Boolean.FALSE));

        new AnimationTimer() {
            @Override
            public void handle(long now) {

                if (painetutNapit.getOrDefault(KeyCode.LEFT, Boolean.FALSE)) {
                    alus.kaannaVasemmalle();
                }
                if (painetutNapit.getOrDefault(KeyCode.RIGHT, Boolean.FALSE)) {
                    alus.kaannaOikealle();
                }
                if (painetutNapit.getOrDefault(KeyCode.UP, false)) {
                    alus.kiihdyta();
                }
                if (painetutNapit.getOrDefault(KeyCode.SPACE, false) && ammukset.size() < 3) {
                    // ammutaan
                    Ammus ammus = new Ammus((int) alus.getHahmo().getTranslateX(), (int) alus.getHahmo().getTranslateY());
                    ammus.getHahmo().setRotate(alus.getHahmo().getRotate());
                    ammukset.add(ammus);

                    ammus.kiihdyta();
                    ammus.setLiike(ammus.getLiike().normalize().multiply(3));

                    ruutu.getChildren().add(ammus.getHahmo());
                }
                alus.liiku();
                asteroidit.forEach(asteroidi -> asteroidi.liiku());
                ammukset.forEach(ammus -> ammus.liiku());
                asteroidit.forEach(asteroidi -> {
                    if (alus.tormaa(asteroidi)) {
                        stop();
                    }
                });
                ammukset.forEach(ammus -> {
                    asteroidit.forEach(asteroidi -> {
                        if (ammus.tormaa(asteroidi)) {
                            ammus.setElossa(false);
                            asteroidi.setElossa(false);
                        }
                    });
                    if (!ammus.isElossa()) {
                        text.setText("Points: " + pisteet.addAndGet(1000));
                    }
                });

                ammukset.stream()
                        .filter(ammus -> !ammus.isElossa())
                        .forEach(ammus -> ruutu.getChildren().remove(ammus.getHahmo()));
                ammukset.removeAll(ammukset.stream()
                        .filter(ammus -> !ammus.isElossa())
                        .collect(Collectors.toList()));

                asteroidit.stream()
                        .filter(asteroidi -> !asteroidi.isElossa())
                        .forEach(asteroidi -> ruutu.getChildren().remove(asteroidi.getHahmo()));
                asteroidit.removeAll(asteroidit.stream()
                        .filter(asteroidi -> !asteroidi.isElossa())
                        .collect(Collectors.toList()));

                if (Math.random() < 0.005) {
                    Asteroidi asteroidi = new Asteroidi(LEVEYS, KORKEUS);
                    if (!asteroidi.tormaa(alus)) {
                        asteroidit.add(asteroidi);
                        ruutu.getChildren().add(asteroidi.getHahmo());
                    }
                }

            }

        }.start();

        stage.setScene(scene);
        stage.show();
    }

}
