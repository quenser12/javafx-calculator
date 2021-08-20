package com.tunguia.javafxcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;
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

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void calculate(){

    }

}