package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Label txtQuestion;
    @FXML private RadioButton choiceA;
    @FXML private RadioButton choiceB;
    @FXML private RadioButton choiceC;
    @FXML private Label displayResult;

    @FXML private StackPane lamanhtest;

    String [] questions = {"Question 1", "Question 2", "Question 3"};
    String [][] answers = { {"1.a", "1.b", "1.c"}, {"2.a", "2.b", "2.c"}, {"3.a", "3.b", "3.c"} };
    String [] correctAnswer = { "1.b", "2.a", "3.a" };
    int questionNumber = 0;

    @Override public void initialize(URL url, ResourceBundle rb) {
        /**Button btnNext = new Button();
        btnNext.setText("Click Me");
        lamanhtest.getChildren().add(btnNext);
         **/
        loadTestQuestion(questionNumber);
    }

    @FXML protected void nextQuestion(MouseEvent mouseEvent) {
        if (questionNumber < (questions.length - 1)) {
            questionNumber++;
            loadTestQuestion(questionNumber);
        }
    }

    @FXML protected void previousQuestion(MouseEvent mouseEvent) {
        if (questionNumber > 0) {
            questionNumber--;
            loadTestQuestion(questionNumber);
        }
    }

    @FXML protected void selectAnswer(MouseEvent mouseEvent) {
        RadioButton selected = (RadioButton) mouseEvent.getSource();
        if (selected.getText() == correctAnswer[questionNumber]) {
            displayResult.setText("you choose " + selected.getText() + " is correct");
        } else {
            displayResult.setText(selected.getText() + " is wrong");
        }


    }


    private void loadTestQuestion(int pQuestionNumber) {
            txtQuestion.setText(questions[pQuestionNumber]);
            choiceA.setText(answers[pQuestionNumber][0]);
            choiceB.setText(answers[pQuestionNumber][1]);
            choiceC.setText(answers[pQuestionNumber][2]);
    }
}
