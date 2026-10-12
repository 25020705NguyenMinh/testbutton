
package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label message = new Label("Bạn chưa bấm nút");

        Button button = new Button("Bấm tôi");

        button.setOnAction(event -> {
            message.setText("Bạn đã bấm nút thành công!");
        });

        VBox layout = new VBox(15, message, button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 250);

        stage.setTitle("Button Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
