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

public class EcuacionCuadraticaFormulario extends JFrame {
    private JLabel lblCoeficienteA, lblCoeficienteB, lblCoeficienteC, lblResultado;
    private JTextField txtCoeficienteA, txtCoeficienteB, txtCoeficienteC;
    private JButton btnCalcular;

    public EcuacionCuadraticaFormulario() {
        setTitle("Ecuación Cuadrática");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblCoeficienteA = new JLabel("Coeficiente A:");
        lblCoeficienteA.setBounds(20, 20, 100, 25);
        add(lblCoeficienteA);

        txtCoeficienteA = new JTextField();
        txtCoeficienteA.setBounds(100, 20, 70, 25);
        add(txtCoeficienteA);

        lblCoeficienteB = new JLabel("Coeficiente B:");
        lblCoeficienteB.setBounds(20, 50, 100, 25);
        add(lblCoeficienteB);

        txtCoeficienteB = new JTextField();
        txtCoeficienteB.setBounds(120, 50, 150, 25);
        add(txtCoeficienteB);

        lblCoeficienteC = new JLabel("Coeficiente C:");
        lblCoeficienteC.setBounds(20, 80, 100, 25);
        add(lblCoeficienteC);

        txtCoeficienteC = new JTextField();
        txtCoeficienteC.setBounds(120, 80, 150, 25);
        add(txtCoeficienteC);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 120, 100, 25);
        add(btnCalcular);

        lblResultado = new JLabel();
        lblResultado.setBounds(20, 160, 250, 25);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double coeficienteA = Double.parseDouble(txtCoeficienteA.getText());
                double coeficienteB = Double.parseDouble(txtCoeficienteB.getText());
                double coeficienteC = Double.parseDouble(txtCoeficienteC.getText());

                double discriminante = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

                if (discriminante > 0) {
                    double raiz1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
                    double raiz2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
                    lblResultado.setText("Soluciones: x1 = " + Math.round(raiz1 * 1000.0) / 1000.0  + ", x2 = " + Math.round(raiz2 * 1000.0));
                } else if (discriminante == 0) {
                    double raiz = -coeficienteB / (2 * coeficienteA);
                    lblResultado.setText("Solución única: x = " + Math.round(raiz * 1000.0));
                } else {
                    lblResultado.setText("No hay soluciones reales");
                }
            }
        });
    }

    public static void main(String[] args) {
        EcuacionCuadraticaFormulario formulario = new EcuacionCuadraticaFormulario();
        formulario.setVisible(true);
    }
}

