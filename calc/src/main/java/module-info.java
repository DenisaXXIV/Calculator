module calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens calculator.calculator to javafx.fxml;
    exports calculator.calculator;
    exports calculator.calculator.operations;
    opens calculator.calculator.operations to javafx.fxml;
}