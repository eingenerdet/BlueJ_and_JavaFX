package javafxpackage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable 
{
    //Attribute (z.T. verknüpft mit entsprechendem FXML)
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textfield;
    private Model model;

    //Konstruktor
    public Controller()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new Model();
    }

    @FXML
    public void manageButton()
    {
        if(textfield.getText().isEmpty())
        {
            model.setNachricht("Bitte eine Nachricht eingeben, dann klicken!");
            button.setText(model.getNachricht());
            label.setText("");
        }
        else
        {
            model.setNachricht(textfield.getText());
            button.setText("Klick!");
            label.setText(model.getNachricht());
        }

    }
} 