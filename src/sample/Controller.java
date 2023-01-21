package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private TextField value;

    @FXML
    private Button meterBtn;

    @FXML
    private Button kilometerBtn;

    @FXML
    private Button volumeBtn;

    @FXML
    private Button inrBtn;

    @FXML
    private Button celciusBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private Label answer;

    @FXML
    void CeltoFah(ActionEvent event) {
        String number = value.getText();

        if(number.trim().isEmpty())
        {
            answer.setText("Please input a value");
        }

        try
        {
            value.setText("(" + number + ") °F");
            double num = Double.parseDouble(number);
            double convert = (num-32) * 5/9;
            String s = Double.toString(convert);
            answer.setText("(" + s + ") °C");
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a number!");
        }
    }

    @FXML
    void INRtoR(ActionEvent event) {
        String number = value.getText();

        if(number.trim().isEmpty())
        {
            answer.setText("Please input a value");
        }

        try
        {
            value.setText("Rs (" + number + ")");
            double num = Double.parseDouble(number);
            double convert = num * 0.37;
            String s = Double.toString(convert);
            answer.setText("INRs (" + s + ")" );
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a number!");
        }
    }

    @FXML
    void KMtoM(ActionEvent event) {
        String number = value.getText();

        if(number.trim().isEmpty())
        {
            answer.setText("Please input a value");
        }

        try
        {
            value.setText("(" + number + ") km");
            double num = Double.parseDouble(number);
            double convert = num * 1000;
            String s = Double.toString(convert);
            answer.setText("(" + s + ") m");
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a number!");
        }
    }

    @FXML
    void MtoKM(ActionEvent event) {
        String number = value.getText();

        if(number.trim().isEmpty())
        {
            answer.setText("Please input a value");
        }

        try
        {
            value.setText("(" + number + ") m");
            double num = Double.parseDouble(number);
            double convert = num * 0.001;
            String s = Double.toString(convert);
            answer.setText("(" + s + ") Km");
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a number!");
        }
    }

    @FXML
    void Volume(ActionEvent event) {
        String number = value.getText();

        if(number.trim().isEmpty())
        {
            answer.setText("Please input a value");
        }

        try
        {
            value.setText("(" + number + ") m");
            double num = Double.parseDouble(number);
            double convert = num * num * num;
            String s = Double.toString(convert);
            answer.setText("(" + s + ") m3");
        }
        catch (NumberFormatException e)
        {
            answer.setText("Please enter a number!");
        }
    }

    @FXML
    void clear(ActionEvent event) {
        value.clear();
        answer.setText("Answer Goes Here...");

    }


}
