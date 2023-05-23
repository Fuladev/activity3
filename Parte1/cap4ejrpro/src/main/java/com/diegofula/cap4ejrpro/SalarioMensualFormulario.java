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

public class SalarioMensualFormulario extends JFrame {
    private JLabel lblNombre, lblSalarioHora, lblHorasTrabajadas, lblResultadoNombre,lblResultadoSalario ;
    private JTextField txtNombre, txtSalarioHora, txtHorasTrabajadas;
    private JButton btnCalcular;

    public SalarioMensualFormulario() {
        setTitle("Salario Mensual");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 150, 25);
        add(txtNombre);

        lblSalarioHora = new JLabel("Salario por Hora:");
        lblSalarioHora.setBounds(20, 50, 100, 25);
        add(lblSalarioHora);

        txtSalarioHora = new JTextField();
        txtSalarioHora.setBounds(120, 50, 150, 25);
        add(txtSalarioHora);

        lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(20, 80, 120, 25);
        add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(150, 80, 120, 25);
        add(txtHorasTrabajadas);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 120, 100, 25);
        add(btnCalcular);

        lblResultadoNombre = new JLabel();
        lblResultadoNombre.setBounds(20, 160, 250, 25);
        add(lblResultadoNombre);
        
        lblResultadoSalario = new JLabel();
        lblResultadoSalario.setBounds(20, 180, 250, 25);
        add(lblResultadoSalario);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                double salarioHora = Double.parseDouble(txtSalarioHora.getText());
                double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());

                double salarioMensual = salarioHora * horasTrabajadas;

                if (salarioMensual > 450000) {
                    lblResultadoNombre.setText("Nombre: " + nombre );
                    lblResultadoSalario.setText( "Salario Mensual: $" + salarioMensual);
                } else {
                    lblResultadoNombre.setText("Nombre: " + nombre);
                }
            }
        });
    }

    public static void main(String[] args) {
        SalarioMensualFormulario formulario = new SalarioMensualFormulario();
        formulario.setVisible(true);
    }
}

