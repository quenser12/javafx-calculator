package com.tunguia.javafxcalculator;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{

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

    int a;
    int b;
    String operation;

    public void equalButtonAction(Event event){
        Operator operator = new Operator();
        int result = operator.calculate(a, b, operation);
        screenTxtf.setText(Integer.toString(result));
    }

    public void handleButtonAction(Event event){


        if(event.getSource() == oneBtn){
            screenText += "1";
            a = 1;
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == plusBtn){
            screenText += "+";
            operation = "add";
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == twoBtn){
            screenText += "2";
            b = 2;
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == threeBtn){
            screenText += "3";
            a = 3;
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == fourBtn){
            screenText += "4";
            b = 4;
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == fiveBtn){
            screenText += "5";
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == sixBtn){
            screenText += "6";
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == sevenBtn){
            screenText += "7";
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == eightBtn){
            screenText += "8";
            screenTxtf.setText(screenText);
        }
        if(event.getSource() == nineBtn){
            screenText += "9";
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
        if(event.getSource() == allClearBtn){
            screenText = "";
            a = 0;
            b = 0;
            operation = "";
            screenTxtf.setText("0");
        }
    }






}