package com.company.ejercClase;

public class SmartWatch extends SmartDevice{
    String colorDeBrazalete;

    public SmartWatch(String conectividad, String sizeScreen, String so, String capBateria, String colorDeBrazalete) {
        super(conectividad, sizeScreen, so, capBateria);
        this.colorDeBrazalete = colorDeBrazalete;
    }

    public SmartWatch(){}

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colorDeBrazalete='" + colorDeBrazalete + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", sizeScreen='" + sizeScreen + '\'' +
                ", so='" + so + '\'' +
                ", capBateria='" + capBateria + '\'' +
                '}';
    }
}
