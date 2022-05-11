package example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
public class RegistrationFormController {
 @FXML
 private TextField Fname;
 @FXML
 private TextField mail;
 @FXML
 private PasswordField Pass;
 @FXML
 private Button submitButton;
 @FXML
 private Button ExitButton;
@FXML
protected void handleSubmitButtonAction(ActionEvent event)
{ 
 Window owner = submitButton.getScene().getWindow();
 if(Fname.getText().isEmpty()) {
 Alert alert = new Alert(AlertType.ERROR);
 alert.setTitle("Form Error!");
 alert.setHeaderText(null);
 alert.setContentText("Please enter your name");
 alert.initOwner(owner);
 alert.show();}
 //……Vous faites le test pour tous les autres champs> 
 //... …………………
 else {
	 Alert alert = new Alert(AlertType.INFORMATION);
	 alert.setTitle("Success");
	 alert.setHeaderText(null);
	 alert.setContentText("Welcome " + Fname.getText());
	 alert.initOwner(owner);
	 alert.show();}
 }
@FXML
protected void handleExitButtonAction(ActionEvent event)
{ 
 System.exit(0);
}
}
