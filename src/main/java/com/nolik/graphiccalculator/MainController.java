package com.nolik.graphiccalculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainController {
    public final Parallelepiped parallelepiped = new Parallelepiped();
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
    protected void recalculate() {
        a.setText(String.valueOf(parallelepiped.getA()));
        b.setText(String.valueOf(parallelepiped.getB()));
        aAngle.setText(String.valueOf(parallelepiped.getAAngle()));
        bAngle.setText(String.valueOf(parallelepiped.getBAngle()));

        area.setText(String.valueOf(parallelepiped.getArea()));
        volume.setText(String.valueOf(parallelepiped.getVolume()));
        inscribedSphereRadius.setText(String.valueOf(parallelepiped.getInscribedSphereRadius()));
        circumscribedSphereRadius.setText(String.valueOf(parallelepiped.getCircumscribedSphereRadius()));
    }

    public void setA(KeyEvent keyEvent) {
        parallelepiped.setA(Float.valueOf(a.getText()));
        recalculate();
    }

    public void setB(KeyEvent keyEvent) {
        parallelepiped.setB(Float.valueOf(b.getText()));
        recalculate();
    }

    public void setAAngle(KeyEvent keyEvent) {
        parallelepiped.setAAngle(Float.valueOf(aAngle.getText()));
        recalculate();
    }

    public void setBAngle(KeyEvent keyEvent) {
        parallelepiped.setBAngle(Float.valueOf(bAngle.getText()));
        recalculate();
    }
}