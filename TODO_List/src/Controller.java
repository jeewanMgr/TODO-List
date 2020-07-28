import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sample.EventAdd;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import static javafx.collections.FXCollections.*;

public class Controller  implements Initializable {

    @FXML
    Button edit;
    @FXML
    Button addEvent;
    @FXML
    TextField yourEvent;
    @FXML
    DatePicker dateEvent;
    @FXML
    ListView<EventAdd> collectData;

    ObservableList<EventAdd> data = FXCollections.observableArrayList();

    public void actionAdding(ActionEvent actionEvent) {
        data.add(new EventAdd(dateEvent.getValue(), yourEvent.getText()));
        collectData.setItems(data);
        edit = new Button();
        edit.setText("edit");
        refresh();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            dateEvent.setValue(LocalDate.now());
    }

    public void refresh()
    {
        dateEvent.setValue(LocalDate.now());
        yourEvent.setText(null);
    }
}
