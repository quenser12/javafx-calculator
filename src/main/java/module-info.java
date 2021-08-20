module com.tunguia.javafxcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tunguia.javafxcalculator to javafx.fxml;
    exports com.tunguia.javafxcalculator;
}