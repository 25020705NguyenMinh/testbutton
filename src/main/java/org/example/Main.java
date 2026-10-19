
package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TextField priceInput = new TextField();
        priceInput.setPromptText("Nhập giá sản phẩm");

        Button checkButton = new Button("Kiểm tra giá");
        Label resultLabel = new Label();

        // Tạo đối tượng Backend
        ProductService productService = new ProductService();

        // Khi người dùng bấm nút
        checkButton.setOnAction(event -> {
            try {
                double price = Double.parseDouble(
                        priceInput.getText()
                );

                // Gọi Backend xử lý
                String result =
                        productService.validatePrice(price);

                // Hiển thị kết quả
                resultLabel.setText(result);

            } catch (NumberFormatException e) {
                resultLabel.setText("Vui lòng nhập một số!");
            }
        });

        VBox root = new VBox(
                10, priceInput, checkButton, resultLabel
        );
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 350, 200));
        stage.setTitle("Kiểm tra giá sản phẩm");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
