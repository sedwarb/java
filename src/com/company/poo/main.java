package com.company.poo;

public class main {
    public static void main(String[] args) {
        Hdd wd = new Hdd("wester Digital","1 Tb","SSD");
        Computador asus = new Computador("Asus","Celeron",wd);
        Laptop x21 = new Laptop("Asus","Celeron",wd,"20pulg");
        System.out.println(asus);
        System.out.println(x21);
    }
}
