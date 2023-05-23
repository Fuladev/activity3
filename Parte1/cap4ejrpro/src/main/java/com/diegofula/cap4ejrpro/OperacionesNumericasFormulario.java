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

public class OperacionesNumericasFormulario extends JFrame {
    private JLabel lblNumero, lblRaizCuadrada, lblCuadrado, lblCubo;
    private JTextField txtNumero;
    private JButton btnCalcular;

    public OperacionesNumericasFormulario() {
        setTitle("Operaciones Numéricas");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 20, 80, 25);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(100, 20, 150, 25);
        add(txtNumero);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 60, 100, 25);
        add(btnCalcular);

        lblRaizCuadrada = new JLabel();
        lblRaizCuadrada.setBounds(20, 100, 250, 25);
        add(lblRaizCuadrada);

        lblCuadrado = new JLabel();
        lblCuadrado.setBounds(20, 130, 250, 25);
        add(lblCuadrado);

        lblCubo = new JLabel();
        lblCubo.setBounds(20, 160, 250, 25);
        add(lblCubo);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(txtNumero.getText());

                double raizCuadrada = Math.sqrt(numero);
                double cuadrado = Math.pow(numero, 2);
                double cubo = Math.pow(numero, 3);

                lblRaizCuadrada.setText("Raíz Cuadrada: " + raizCuadrada);
                lblCuadrado.setText("Cuadrado: " + cuadrado);
                lblCubo.setText("Cubo: " + cubo);
            }
        });
    }

    public static void main(String[] args) {
        OperacionesNumericasFormulario formulario = new OperacionesNumericasFormulario();
        formulario.setVisible(true);
    }
}
