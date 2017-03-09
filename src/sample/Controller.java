package sample;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class Controller {
    private String[] questions = {
            "Which group of American Indians used bison as a resource?",
            "Which American Indians traveled by walking and using canoes?",
            "Which group used adobe to build their homes?"};

    @FXML private Label actiontarget;
    @FXML private Label lbl_question;
    @FXML private ToggleGroup toggleGroupAnswer;

    @FXML protected void handleNextButtonAction(MouseEvent mouseEvent) {
        lbl_question.setText(questions[1]);
        actiontarget.setText(questions[1]);
    }

    @FXML protected void handleAnswerSelectedAction(MouseEvent mouseEvent) {
        RadioButton clickButton = (RadioButton) mouseEvent.getSource();
        actiontarget.setText(clickButton.getId());
    }


}
