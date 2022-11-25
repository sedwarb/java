package com.company.ejercClase;

public class SmartPhone extends SmartDevice{
    String sizeCamaraTrasera;

    public SmartPhone(String conectividad, String sizeScreen, String so, String capBateria, String sizeCamaraTrasera) {
        super(conectividad, sizeScreen, so, capBateria);
        this.sizeCamaraTrasera = sizeCamaraTrasera;
    }

    public SmartPhone(){}

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sizeCamaraTrasera='" + sizeCamaraTrasera + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", sizeScreen='" + sizeScreen + '\'' +
                ", so='" + so + '\'' +
                ", capBateria='" + capBateria + '\'' +
                '}';
    }
}
