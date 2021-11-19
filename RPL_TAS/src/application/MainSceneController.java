package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MainSceneController {

	// Event Listener on Button.onAction
	@FXML
	private TextField tfTitle = new TextField() ;
	
	public void btnOnClicked(ActionEvent event) {

		Stage mainWindow  = (Stage) tfTitle.getScene().getWindow();
		String title = tfTitle.getText();
		mainWindow.setTitle(title);
		
	}
}
