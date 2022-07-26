module com.nolik.graphiccalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nolik.graphiccalculator to javafx.fxml;
    exports com.nolik.graphiccalculator;
}