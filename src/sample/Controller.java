package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.converter.IntegerStringConverter;


public class Controller {
    public String userName = "none";
    public String userAge = null;
    public String userYear = "xxxx";

    @FXML
    public Text textBar;
    @FXML
    public Text displaystats;
    @FXML
    public Text displaystats5;
    @FXML
    public Text displaystats10;

@FXML
    public Button clickConfirm;
@FXML
    public Button restart;
@FXML
public TextField userIn;
public int numClicks = 0;

public void clickedTheConfirm(ActionEvent actionEvent){
    numClicks++;


    if(numClicks == 1){
        userName = userIn.getText();
        userIn.clear();
        textBar.setText("Enter Your age");

    }else if (numClicks == 2){
        userAge = userIn.getText();
        userIn.clear();
        textBar.setText("Enter the current year.");
    }else if (numClicks == 3) {
        userYear = userIn.getText();
        userIn.clear();
        textBar.setText(userName + " Your current age is " + userAge);


        int intAge = Integer.parseInt(userAge);
        int intYear = Integer.parseInt(userYear);
        int year1 = intYear + 1;
        int year5 = intYear + 5;
        int year10 = intYear + 10;
        int age1 = intAge + 1;
        int age5 = intAge + 5;
        int age10 = intAge + 10;


        displaystats.setText("You will be " + age1 + " in " + year1);
        displaystats5.setText("You will be " + age5 + " in " + year5);
        displaystats10.setText("You will be " + age10 + " in " + year10);

    }

//    String userInput1 = textBar.getText();
//    userIn.clear();
//    textBar.setText("Enter the current year");
//    String userInput2 = textBar.getText();




//    int userIn = Integer.parseInt(userInPut);
//    if(name.equals("none"))
//        name = userInPut;
//    if (age.equals(null))
//        age = userInPut;
//    if (year.equals("xxxx"))
//        year = userInPut;




}

    public void Restart ( ActionEvent actionEvent ) {
    userIn.clear();
    numClicks = 0;
    textBar.setText("Hello, Enter your name.");
        displaystats.setText("");
        displaystats5.setText("");
        displaystats10.setText("");

    }

//public void userInPut (ActionEvent actionEvent){
//    textBar.setText("Enter your name." + userIn);
//    String userNameString= userIn.getText();
//    String userAgeString = userIn.getText();
//    String userYearString = userIn.getText();


//    textBar.setText("Enter the current year." + userIn);
//    textBar.setText("Enter your age" + userIn);
//    userIn.clear();
}

