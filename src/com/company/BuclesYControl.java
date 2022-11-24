package com.company;

public class BuclesYControl {
    public static void main(String[] args) {
        String[] simonBolivar = {"Simon","Jose","Antonio","Santisima Trinidad","Bolivar","Ponte Palacios", "Blanco"};
        String nombreCompleto = "";
        for(int i=0;i < simonBolivar.length;i++){
            if(i==0){
                nombreCompleto = simonBolivar[i]+" ";
            }
            if(i==1 || i==2 || i==4){
                nombreCompleto+=simonBolivar[i]+" ";
            }
            if(i==3){
                nombreCompleto+="de la "+simonBolivar[i]+" ";
            }
            if(i==5 || i==6){
                nombreCompleto+="y "+simonBolivar[i]+" ";
            }
        }
        System.out.println("Nombre Completo de Simon Bolivar:");
        System.out.println(nombreCompleto);
    }
}
