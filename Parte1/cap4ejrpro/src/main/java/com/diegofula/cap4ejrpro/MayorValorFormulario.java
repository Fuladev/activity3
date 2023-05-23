/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.cap4ejrpro;

/**
 *
 * @author Diego Fula
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MayorValorFormulario extends JFrame {
    private JLabel lblNumero, lblResultado, title;
    private JTextField txtNumero;
    private JButton btnEncontrar;

    public MayorValorFormulario() {
        setTitle("Encontrar Mayor Valor");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        
        title = new JLabel("Digite el arreglo de numeros separados por un espacio");
        title.setBounds(20, 20, 400, 25);
        add(title);
        
        lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 60, 80, 25);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(100, 60, 220, 25);
        add(txtNumero);

        btnEncontrar = new JButton("Encontrar");
        btnEncontrar.setBounds(100, 100, 100, 25);
        add(btnEncontrar);

        lblResultado = new JLabel();
        lblResultado.setBounds(20, 140, 250, 25);
        add(lblResultado);

        btnEncontrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] numerosStr = txtNumero.getText().split(" ");
                int mayor = 0;

                for (int i = 0; i < numerosStr.length; i++) {
                    int numero = Integer.parseInt(numerosStr[i]);

                    if (numero > mayor) {
                        mayor = numero;
                    }
                }

                lblResultado.setText("Mayor Valor: " + mayor);
            }
        });
    }

    public static void main(String[] args) {
        MayorValorFormulario formulario = new MayorValorFormulario();
        formulario.setVisible(true);
    }
}
