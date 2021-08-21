package com.tunguia.javafxcalculator;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField screenTxtf;
    @FXML
    private Button zeroBtn;
    @FXML
    private Button oneBtn;
    @FXML
    private Button twoBtn;
    @FXML
    private Button threeBtn;
    @FXML
    private Button fourBtn;
    @FXML
    private Button fiveBtn;
    @FXML
    private Button sixBtn;
    @FXML
    private Button sevenBtn;
    @FXML
    private Button eightBtn;
    @FXML
    private Button nineBtn;
    @FXML
    private Button allClearBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private Button percentBtn;
    @FXML
    private Button multiplyBtn;
    @FXML
    private Button minusBtn;
    @FXML
    private Button plusBtn;
    @FXML
    private Button equalsBtn;
    @FXML
    private Button pointBtn;

    String screenText = "";



    public void handleButtonAction(Event event){

        if(event.getSource() == oneBtn){
            screenText += "1";
            screenTxtf.setText(screenText);
        }
        if(!screenText.isEmpty() && event.getSource() == deleteBtn){
            String newText = screenText.substring(0, screenText.length()-1);
            screenText = newText;
            System.out.println(screenText);
            screenTxtf.setText(screenText);
            if (screenText.isEmpty()){
                screenTxtf.setText("0");
            }
        }
    }

}