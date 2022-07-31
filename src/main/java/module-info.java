module com.nolik.graphiccalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.nolik.graphiccalculator to javafx.fxml;
    exports com.nolik.graphiccalculator;
}