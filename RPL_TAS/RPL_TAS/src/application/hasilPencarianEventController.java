package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class hasilPencarianEventController {

	private String kataKunciPencarian;
    @FXML
    private AnchorPane HasilPencarianEventPane;

    @FXML
    private Button btnKembali;

//    @FXML
//    private TableView<?> tabelHasil;
//
//    @FXML
//    private TableColumn<?, ?> kolomPeriod;
//
//    @FXML
//    private TableColumn<?, ?> kolomJudulAyat;
//
//    @FXML
//    private TableColumn<?, ?> kolomIsiAyat;
    
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

    @FXML
    void btnKembaliEvent(ActionEvent event) {

    }
    
    public void getKataKunciPencarianEvent(String katakunci) {
    	this.kataKunciPencarian = katakunci;
    }
    
    

}
