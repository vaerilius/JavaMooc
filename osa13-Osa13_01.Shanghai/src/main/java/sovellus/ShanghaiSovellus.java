package sovellus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) throws Exception {

        Map<Integer, Integer> map = new HashMap();
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        xAxis.setLabel("Sijoitus");
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        yAxis.setLabel("Vuosi");

        map.put(2007, 73);
        map.put(2008, 68);
        map.put(2009, 72);
        map.put(2010, 72);
        map.put(2011, 74);
        map.put(2012, 73);
        map.put(2013, 76);
        map.put(2014, 73);
        map.put(2015, 67);
        map.put(2016, 56);
        map.put(2017, 56);
        XYChart.Series data = new XYChart.Series();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            data.setName("Vuosi");
            data.getData().add(new XYChart.Data(key, value));
        }

        LineChart lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Helsingin yliopisto, Shanghai-ranking");
        lineChart.getData().add(data);
        window.setScene(new Scene(lineChart, 640, 480));
        window.show();
    }

}
