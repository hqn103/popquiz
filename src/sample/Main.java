package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("lamanh.fxml"));

        //StackPane root = new StackPane();
        //loadTest(root);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 949, 460));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private void loadTest(StackPane pStackPane) {
        Button btnNext = new Button("Next");
        Label lblQuestion = new Label("Question number 1");
        pStackPane.getChildren().add(lblQuestion);
        pStackPane.getChildren().add(btnNext);
    }
}
