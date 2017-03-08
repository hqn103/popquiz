package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    private String[] questions = {
            "Which group of American Indians used bison as a resource?",
            "Which American Indians traveled by walking and using canoes?",
            "Which group used adobe to build their homes?"};

    @FXML private Label actiontarget;
    @FXML private Label lbl_question;

    @FXML protected void handleNextButtonAction(MouseEvent mouseEvent) {
        lbl_question.setText(questions[0]);
        actiontarget.setText(questions[1]);
    }
}
