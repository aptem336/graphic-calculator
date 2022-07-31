package com.nolik.graphiccalculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    public TextField a;
    @FXML
    public TextField b;
    @FXML
    public TextField aAngle;
    @FXML
    public TextField bAngle;
    @FXML
    private TextField area;
    @FXML
    private TextField volume;
    @FXML
    private TextField inscribedSphereRadius;
    @FXML
    private TextField circumscribedSphereRadius;

    @FXML
    protected void calculate() {
    }
}