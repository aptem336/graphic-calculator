package com.nolik.graphiccalculator;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;

public class MainController {
    public final Parallelepiped parallelepiped = new Parallelepiped();
    @FXML
    public FloatField a;
    @FXML
    public FloatField b;
    @FXML
    public FloatField aAngle;
    @FXML
    public FloatField bAngle;
    @FXML
    private FloatField area;
    @FXML
    private FloatField volume;
    @FXML
    private FloatField inscribedSphereRadius;
    @FXML
    private FloatField circumscribedSphereRadius;

    @FXML
    protected void recalculate() {
        area.setText(String.valueOf(parallelepiped.getArea()));
        volume.setText(String.valueOf(parallelepiped.getVolume()));
        inscribedSphereRadius.setText(String.valueOf(parallelepiped.getInscribedSphereRadius()));
        circumscribedSphereRadius.setText(String.valueOf(parallelepiped.getCircumscribedSphereRadius()));
    }

    public void setA(KeyEvent keyEvent) {
        parallelepiped.setA(a.getValue());
        recalculate();
        b.setText(String.valueOf(parallelepiped.getB()));
        aAngle.setText(String.valueOf(parallelepiped.getAAngle()));
        bAngle.setText(String.valueOf(parallelepiped.getBAngle()));

    }

    public void setB(KeyEvent keyEvent) {
        parallelepiped.setB(b.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        aAngle.setText(String.valueOf(parallelepiped.getAAngle()));
        bAngle.setText(String.valueOf(parallelepiped.getBAngle()));
    }

    public void setAAngle(KeyEvent keyEvent) {
        parallelepiped.setAAngle(aAngle.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        b.setText(String.valueOf(parallelepiped.getB()));
        bAngle.setText(String.valueOf(parallelepiped.getBAngle()));
    }

    public void setBAngle(KeyEvent keyEvent) {
        parallelepiped.setBAngle(bAngle.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        b.setText(String.valueOf(parallelepiped.getB()));
        aAngle.setText(String.valueOf(parallelepiped.getAAngle()));
    }
}