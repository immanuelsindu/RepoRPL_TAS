package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EventController {

    @FXML
    private AnchorPane EventPane;

    @FXML
    private Button btnCari;

    @FXML
    private TextField tfPencarianEvent;

    @FXML
    private Button btnKembali;

    @FXML
    void btnCariEvent(ActionEvent event) throws IOException {
    	String kunciCariEvent = tfPencarianEvent.getText();
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("hasilPencarianEvent.fxml"));
    	Parent root = loader.load();
    	
    	hasilPencarianEventController schpec = loader.getController();
    	schpec.getKataKunciPencarianEvent(kunciCariEvent);
    	
    	
    			
    	
    }

    @FXML
    void btnEventKembaliHome(ActionEvent event) {

    }

}
