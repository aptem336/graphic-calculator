package com.nolik.graphiccalculator;

import lombok.Data;

@Data
public class Parallelepiped {
    private Float a = Float.NaN;
    private Float b = Float.NaN;
    private Float c = Float.NaN;
    private Float aAngle = Float.NaN;
    private Float bAngle = Float.NaN;
    private Float circumscribedSphereRadius = Float.NaN;

    public void setBAngle(Float bAngle) {
        this.bAngle = bAngle;
        this.b = Float.NaN;
    }

    /**
     * Катет равен другому катету, умноженному на тангенс противолежащего или котангенс прилежащего к первому катету угла.
     *
     * @return вычисленная сторона B
     */
    public Float getB() {
        return Float.isNaN(b) ? a * 1.0F / (float) Math.tan(Math.toRadians(bAngle)) : b;
    }

    public void setB(Float b) {
        this.b = b;
        this.bAngle = Float.NaN;
    }

    /**
     * Катет равен другому катету, умноженному на тангенс противолежащего или котангенс прилежащего к первому катету угла.
     *
     * @return вычисленная сторона С
     */
    public Float getC() {
        return a * 1.0F / (float) Math.tan(Math.toRadians(aAngle));
    }

    public Float getArea() {
        return a * getB() * 2 + a * getC() * 2 + getB() * getC() * 2;
    }

    public Float getVolume() {
        return a * getB() * getC();
    }

    /**
     * Сферу можно вписать только в куб,
     * радиус равен половине стороны
     * @return радиус вписанной сферы
     */
    public Float getInscribedSphereRadius() {
        if (getA().equals(getB()) && getB().equals(getC())) {
            return getA() / 2;
        } else {
            return Float.NaN;
        }
    }

    /**
     * Радиус описанной сферы равен половине диагонали
     * @return радиус описанной сферы
     */
    public Float getCircumscribedSphereRadius() {
        return (float) Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2) + Math.pow(getC(), 2)) / 2;
    }
}
