package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class MainSceneController implements Initializable{
	

	// Event Listener on Button.onAction
	@FXML
	private TextField tfTitle = new TextField();

	
	public void btnOnClicked(ActionEvent event) {

		Stage mainWindow = (Stage) tfTitle.getScene().getWindow();
		String title = tfTitle.getText();
		mainWindow.setTitle(title);
	}
	
	//button ke Event
	@FXML
	private AnchorPane MainScenePane;
	
	public void btnEvent(ActionEvent event) throws Exception {               
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("event.fxml"));
			MainScenePane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	//button ke Periode
	public void btnPeriod(ActionEvent event) throws Exception {               
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("period.fxml"));
			MainScenePane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	//button kembali dari Event ke Home
	@FXML
	private AnchorPane EventPane;
	
	public void btnEventKembaliHome(ActionEvent event) throws Exception {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			EventPane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	//button kembali dari Period ke Home

	public void btnPeriodKembaliHome(ActionEvent event) throws Exception {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			PeriodPane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	@FXML
    private TextField tfPencarianEvent;
	
	@FXML
    private Button btnCari;
	
	@FXML
	private TableView<IsiEvent> tabelHasil = new TableView<IsiEvent>();
	
	@FXML
	private TableColumn<IsiEvent,String> kolomPeriod = new TableColumn<IsiEvent,String>();
	
	@FXML
	private TableColumn<IsiEvent,String> kolomJudulAyat = new TableColumn<IsiEvent,String>();
	
	@FXML
	private TableColumn<IsiEvent,String> kolomIsiAyat= new TableColumn<IsiEvent,String>();
	

	
	//
	ObservableList<IsiEvent> listEvent  = FXCollections.observableArrayList(
		new IsiEvent("66", "2Pet.3.18", "But grow in grace, and in the knowledge of our Lord and Saviour Jesus Christ. To him be glory both now and for ever. Amen."),
		new IsiEvent("90", "1John.1.5", "This then is the message which we have heard of him, and declare unto you, that God is light, and in him is no darkness at all."),
		new IsiEvent("90", "1John.2.11", "But he that hateth his brother is in darkness, and walketh in darkness, and knoweth not whither he goeth, because that darkness hath blinded his eyes."),
		new IsiEvent("90", "1John.3.2", "Beloved, now are we the sons of God, and it doth not yet appear what we shall be: but we know that, when he shall appear, we shall be like him; for we shall see him as he is."),
		new IsiEvent("90", "1John.3.12", "Not as Cain, who was of that wicked one, and slew his brother. And wherefore slew he him? Because his own works were evil, and his brother’s righteous."),
		new IsiEvent("96", "Rev.1.7", "Behold, he cometh with clouds; and every eye shall see him, and they also which pierced him: and all kindreds of the earth shall wail because of him. Even so, Amen."),
		new IsiEvent("96", "Rev.10.9", "And I went unto the angel, and said unto him, Give me the little book. And he said unto me, Take it, and eat it up; and it shall make thy belly bitter, but it shall be in thy mouth sweet as honey.")	
	);
	
	//button cari Event
	public void btnCariEvent(ActionEvent event) throws Exception {
		try {
			String kunciCariEvent = tfPencarianEvent.getText();
			
			
			AnchorPane pane = FXMLLoader.load(getClass().getResource("hasilPencarianEvent.fxml"));
			EventPane.getChildren().setAll(pane);
			
			
			
			
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		kolomPeriod.setCellValueFactory(new PropertyValueFactory<IsiEvent,String>("kolomPeriod"));
		kolomJudulAyat.setCellValueFactory(new PropertyValueFactory<IsiEvent, String>("kolomJudulAyat"));
		kolomIsiAyat.setCellValueFactory(new PropertyValueFactory<IsiEvent, String>("kolomIsiAyat"));
		
		tabelHasil.setItems(listEvent);
	}
	
	@FXML
	private AnchorPane PeriodPane;
	
//<<<<<<< HEAD
//	 
//	
//	//button kembali ke pencarian
//=======
	//button cari Period
	public void btnCariPeriod(ActionEvent event) throws Exception {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("hasilPencarianEvent.fxml")); //ini vito 
			PeriodPane.getChildren().setAll(pane);
			
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	
	//button kembali ke pencarian Event
//>>>>>>> a2479a860f847e5842f96a3b3b81e618cecf0878
	@FXML
	private AnchorPane HasilPencarianEventPane;
	
	public void btnKembaliEvent(ActionEvent event) throws Exception {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("event.fxml"));
			HasilPencarianEventPane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
	//button kembali ke pencarian Period
	@FXML
	private AnchorPane HasilPencarianPeriodPane;
	
	public void btnKembaliPeriod(ActionEvent event) throws Exception {
		try {
			AnchorPane pane = FXMLLoader.load(getClass().getResource("period.fxml"));
			HasilPencarianPeriodPane.getChildren().setAll(pane);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}	
	
	//contoh kalau mau open new window -> bisa dipakai buat timeline
	public void btnCari(ActionEvent event) throws Exception {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hasilPencarianEvent.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage secondWindow = new Stage();
			secondWindow.setScene(new Scene(root1));
			secondWindow.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
