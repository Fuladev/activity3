/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.cap4ej10;

/**
 *
 * @author Diego Fula
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagoMatriculaFormulario extends JFrame {
    private JLabel lblInscripcion, lblNombres, lblPatrimonio, lblEstrato, lblPagoMatricula;
    private JTextField txtInscripcion, txtNombres, txtPatrimonio, txtEstrato;
    private JButton btnCalcular;

    public PagoMatriculaFormulario() {
        setTitle("Pago de Matrícula");
        setSize(300, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblInscripcion = new JLabel("Número de Inscripción:");
        lblInscripcion.setBounds(20, 20, 150, 25);
        add(lblInscripcion);

        txtInscripcion = new JTextField();
        txtInscripcion.setBounds(170, 20, 100, 25);
        add(txtInscripcion);

        lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(20, 50, 80, 25);
        add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBounds(170, 50, 100, 25);
        add(txtNombres);

        lblPatrimonio = new JLabel("Patrimonio:");
        lblPatrimonio.setBounds(20, 80, 80, 25);
        add(lblPatrimonio);

        txtPatrimonio = new JTextField();
        txtPatrimonio.setBounds(170, 80, 100, 25);
        add(txtPatrimonio);

        lblEstrato = new JLabel("Estrato:");
        lblEstrato.setBounds(20, 110, 80, 25);
        add(lblEstrato);

        txtEstrato = new JTextField();
        txtEstrato.setBounds(170, 110, 100, 25);
        add(txtEstrato);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 25);
        add(btnCalcular);

        lblPagoMatricula = new JLabel();
        lblPagoMatricula.setBounds(20, 190, 200, 25);
        add(lblPagoMatricula);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int patrimonio = Integer.parseInt(txtPatrimonio.getText());
                int estrato = Integer.parseInt(txtEstrato.getText());
                int pagoMatricula = 50000;

                if (patrimonio > 2000000 && estrato > 3) {
                    double incremento = patrimonio * 0.03;
                    pagoMatricula += incremento;
                }

                lblPagoMatricula.setText("Pago de Matrícula: $" + pagoMatricula);
            }
        });
    }

    public static void main(String[] args) {
        PagoMatriculaFormulario formulario = new PagoMatriculaFormulario();
        formulario.setVisible(true);
    }
}

