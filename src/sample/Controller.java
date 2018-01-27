package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.converter.IntegerStringConverter;


public class Controller {
    int numberOfTries =0;
    String name = "none";
    String age = null;
    String year = "xxxx";

    @FXML
    public Text textBar;

@FXML
    public Button clickConfirm;
@FXML
    public Button restart;
@FXML
public TextField userIn;

public void clickedTheConfirm(ActionEvent actionEvent){
    numberOfTries ++;
    userIn.clear();
    textBar.setText("Enter Your age");

    userIn.clear();
    textBar.setText("Enter the current year");
//    String userInPut = userIn.getText();
//    int userIn = Integer.parseInt(userInPut);
//    if(name.equals("none"))
//        name = userInPut;
//    if (age.equals(null))
//        age = userInPut;
//    if (year.equals("xxxx"))
//        year = userInPut;




}

//public void userInPut (ActionEvent actionEvent){
//    textBar.setText("Enter your name." + userIn);
//    String userNameString= userIn.getText();
//    String userAgeString = userIn.getText();
//    String userYearString = userIn.getText();
//    int intAge = Integer.parseInt(userAgeString);
//    int intYear = Integer.parseInt(userYearString);


//    textBar.setText("Enter the current year." + userIn);
//    textBar.setText("Enter your age" + userIn);
//    userIn.clear();
}

