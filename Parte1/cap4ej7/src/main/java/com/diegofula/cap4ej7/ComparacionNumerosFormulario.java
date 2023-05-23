/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.cap4ej7;

/**
 *
 * @author Diego Fula
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparacionNumerosFormulario extends JFrame {
    private JLabel lblValorA, lblValorB, lblResultado;
    private JTextField txtValorA, txtValorB;
    private JButton btnComparar;

    public ComparacionNumerosFormulario() {
        setTitle("Comparación de Números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblValorA = new JLabel("Valor A:");
        lblValorA.setBounds(20, 20, 80, 25);
        add(lblValorA);

        txtValorA = new JTextField();
        txtValorA.setBounds(120, 20, 150, 25);
        add(txtValorA);

        lblValorB = new JLabel("Valor B:");
        lblValorB.setBounds(20, 50, 80, 25);
        add(lblValorB);

        txtValorB = new JTextField();
        txtValorB.setBounds(120, 50, 150, 25);
        add(txtValorB);

        btnComparar = new JButton("Comparar");
        btnComparar.setBounds(100, 90, 100, 25);
        add(btnComparar);

        lblResultado = new JLabel();
        lblResultado.setBounds(20, 130, 200, 25);
        add(lblResultado);

        btnComparar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valorA = Integer.parseInt(txtValorA.getText());
                int valorB = Integer.parseInt(txtValorB.getText());

                if (valorA > valorB) {
                    lblResultado.setText("A es mayor que B");
                } else if (valorA < valorB) {
                    lblResultado.setText("A es menor que B");
                } else {
                    lblResultado.setText("A es igual a B");
                }
            }
        });
    }

    public static void main(String[] args) {
        ComparacionNumerosFormulario formulario = new ComparacionNumerosFormulario();
        formulario.setVisible(true);
    }
}

