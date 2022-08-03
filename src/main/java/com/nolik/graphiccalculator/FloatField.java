package com.nolik.graphiccalculator;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class FloatField extends TextField {
    private final FloatProperty value;

    public FloatField() {
        this(Float.NaN);
    }

    public FloatField(Float initialValue) {
        setText(String.valueOf(initialValue));
        final FloatField intField = this;
        value = new SimpleFloatProperty(initialValue);
        value.addListener((observableValue, oldValue, newValue) -> {
            if (newValue == null) {
                intField.setText("");
            } else {
                if (newValue.intValue() != 0
                        || (textProperty().get() != null
                        && !"".equals(textProperty().get()))
                ) {
                    intField.setText(newValue.toString());
                }
            }
        });

        this.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            if (!"0123456789.".contains(keyEvent.getCharacter())) {
                keyEvent.consume();
            }
        });

        this.textProperty().addListener((observableValue, oldValue, newValue) -> {
            try {
                value.set(Float.parseFloat(textProperty().get()));
            } catch (NumberFormatException ignored) {
            }
        });
    }

    public Float getValue() {
        return value.getValue();
    }
}