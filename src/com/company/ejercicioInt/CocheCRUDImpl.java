package com.company.ejercicioInt;

public class CocheCRUDImpl implements CocheCRUD{
    String texto1;
    String texto2;
    String texto3;

    public CocheCRUDImpl() {}

    public CocheCRUDImpl(String texto1, String texto2, String texto3) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
    }

    @Override
    public String save() {
        return this.texto1;
    }

    @Override
    public String findAll() {
        return this.texto2;
    }

    @Override
    public String delete() {
        return this.texto3;
    }
}
