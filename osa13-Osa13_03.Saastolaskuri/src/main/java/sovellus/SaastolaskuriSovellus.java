package sovellus;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SaastolaskuriSovellus.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        BorderPane borderPane = new BorderPane();

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);

        BorderPane top = new BorderPane();
        BorderPane bottom = new BorderPane();

        Slider sliderTop = new Slider();
        Slider sliderBottom = new Slider();

        top.setLeft(new Label("Kuukausittainen tallennus"));
        bottom.setLeft(new Label("Vuosittainen korko"));

        sliderTop.setMin(25);
        sliderTop.setMax(250);
        sliderTop.setShowTickLabels(true);
        sliderTop.setShowTickMarks(true);
        sliderTop.setSnapToTicks(true);
        sliderTop.setBlockIncrement(500);

        sliderBottom.setMin(0);
        sliderBottom.setMax(10);
        sliderBottom.setValue(0);
        sliderBottom.setShowTickMarks(true);
        sliderBottom.setShowTickLabels(true);
        sliderBottom.setMajorTickUnit(10);
        sliderBottom.setMinorTickCount(5);
        sliderBottom.setBlockIncrement(10);

        Label topValue = new Label("25");
        Label bottomValue = new Label("0");

        top.setRight(topValue);
        top.setCenter(sliderTop);

        bottom.setRight(bottomValue);
        bottom.setCenter(sliderBottom);

        vBox.getChildren().addAll(top, bottom);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Säästölaskuri");
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.autosize();

        borderPane.setCenter(lineChart);
        borderPane.setTop(vBox);

        XYChart.Series saastoData = new XYChart.Series();
        XYChart.Series korkoData = new XYChart.Series();

        lineChart.getData().add(saastoData);
        lineChart.getData().add(korkoData);

        sliderTop.setOnMouseReleased((event) -> {
            topValue.setText("" + sliderTop.getValue());
            setData(sliderTop.getValue(), saastoData, korkoData, sliderBottom.getValue());

        });
        sliderBottom.valueProperty().addListener((observable) -> {
            bottomValue.setText(String.valueOf(sliderBottom.getValue()));
            setData(Math.round(sliderTop.getValue()), saastoData, korkoData, sliderBottom.getValue());

        });

        Scene scene = new Scene(borderPane, 400, 320);
        window.setScene(scene);

        window.show();
    }

    private void setData(double kkSaasto, XYChart.Series saastot, XYChart.Series korkoData, double korko) {
        saastot.getData().clear();
        korkoData.getData().clear();

        double korollinen = 0;
        saastot.getData().add(new XYChart.Data(0, 0));
        korkoData.getData().add(new XYChart.Data(0, 0));

        for (int i = 1; i <= 30; i++) {

            korollinen += kkSaasto * 12;
            korollinen *= (1 + korko / 100.0);
            System.out.println(kkSaasto);
            System.out.println(i * kkSaasto * 12);
            saastot.getData().add(new XYChart.Data(i,i * kkSaasto * 12));

            korkoData.getData().add(new XYChart.Data(i, korollinen));

        }

    }

}
