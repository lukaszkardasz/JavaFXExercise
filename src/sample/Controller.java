package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;




public class Controller {

    //inicjalizacja pola z obiektu z designera, a nie null jak zwykly obiekt
    @FXML
    private TextField myTextField;

    @FXML
    private Label myLabel;

    @FXML
    private Button myButton;

    @FXML
    private ProgressBar myProgressBar;

    public void buttonClicked(MouseEvent mouseEvent) {
        myLabel.setText(myTextField.getText());
    }
}
