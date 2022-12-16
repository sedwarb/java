package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane TPrecio;
    private JTextPane TIVA;
    private JTextPane TTotal;
    private JButton BCalcular;
    private JPanel calculador;

    public MainForm() {
        BCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double precio = Double.parseDouble(TPrecio.getText());
                Double iva = Double.parseDouble(TIVA.getText());
                Double resultado = precio + (iva*precio);
                TTotal.setText(resultado.toString());
            }
        });
        TPrecio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                //String papa = TPrecio.getText();
                //System.out.println(papa);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcular");
        frame.setContentPane(new MainForm().calculador);
        frame.setVisible(true);
    }
}
