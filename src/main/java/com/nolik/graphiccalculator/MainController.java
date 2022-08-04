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
    public FloatField c;
    @FXML
    public FloatField AD1Angle;
    @FXML
    public FloatField AD2Angle;
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
        c.setText(String.valueOf(parallelepiped.getC()));
        area.setText(String.valueOf(parallelepiped.getArea()));
        volume.setText(String.valueOf(parallelepiped.getVolume()));
        inscribedSphereRadius.setText(String.valueOf(parallelepiped.getInscribedSphereRadius()));
        circumscribedSphereRadius.setText(String.valueOf(parallelepiped.getCircumscribedSphereRadius()));
    }

    public void setA(KeyEvent keyEvent) {
        parallelepiped.setA(a.getValue());
        recalculate();
        b.setText(String.valueOf(parallelepiped.getB()));
        AD1Angle.setText(String.valueOf(parallelepiped.getAD1Angle()));
        AD2Angle.setText(String.valueOf(parallelepiped.getAD2Angle()));

    }

    public void setB(KeyEvent keyEvent) {
        parallelepiped.setB(b.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        AD1Angle.setText(String.valueOf(parallelepiped.getAD1Angle()));
        AD2Angle.setText(String.valueOf(parallelepiped.getAD2Angle()));
    }

    public void setAD1Angle(KeyEvent keyEvent) {
        parallelepiped.setAD1Angle(AD1Angle.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        b.setText(String.valueOf(parallelepiped.getB()));
        AD2Angle.setText(String.valueOf(parallelepiped.getAD2Angle()));
    }

    public void setAD2Angle(KeyEvent keyEvent) {
        parallelepiped.setABAngle(AD2Angle.getValue());
        recalculate();
        a.setText(String.valueOf(parallelepiped.getA()));
        b.setText(String.valueOf(parallelepiped.getB()));
        AD1Angle.setText(String.valueOf(parallelepiped.getAD1Angle()));
    }
}