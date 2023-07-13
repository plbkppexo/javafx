package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class StudentController {
    @FXML
    Label nameLabel;
    @FXML
    Label idLabel;
    @FXML
    Label scoreLabel;
    @FXML
    public void initialize() {
        Student student = new Student("6410400001", "Tony Stark");
        showStudent(student);
    }

    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
        idLabel.setText(student.getId());
        String scoreFormat = String.format("%.2f" , student.getScore());
        scoreLabel.setText(scoreFormat);
    }

    @FXML
    protected  void onHandleButtonClick() {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}