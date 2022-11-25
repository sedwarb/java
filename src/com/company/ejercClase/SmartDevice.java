package com.company.ejercClase;

public abstract class SmartDevice {
    String conectividad;
    String sizeScreen;
    String so;
    String capBateria;

    public SmartDevice(String conectividad, String sizeScreen, String so, String capBateria) {
        this.conectividad = conectividad;
        this.sizeScreen = sizeScreen;
        this.so = so;
        this.capBateria = capBateria;
    }

    public SmartDevice(){}
}
