/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.cap3ej18;

/**
 *
 * @author Diego Fula
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoFormulario extends JFrame {
    private JLabel lblCodigo, lblNombres, lblHorasTrabajadas, lblValorHora, lblRetencion, lblSalarioBruto, lblSalarioNeto;
    private JTextField txtCodigo, txtNombres, txtHorasTrabajadas, txtValorHora, txtRetencion;
    private JButton btnCalcular;

    public EmpleadoFormulario() {
        setTitle("Calculadora de Salario");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 80, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 150, 25);
        add(txtCodigo);

        lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(20, 50, 80, 25);
        add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBounds(120, 50, 150, 25);
        add(txtNombres);

        lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(20, 80, 120, 25);
        add(lblHorasTrabajadas);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(150, 80, 120, 25);
        add(txtHorasTrabajadas);

        lblValorHora = new JLabel("Valor Hora:");
        lblValorHora.setBounds(20, 110, 80, 25);
        add(lblValorHora);

        txtValorHora = new JTextField();
        txtValorHora.setBounds(120, 110, 150, 25);
        add(txtValorHora);

        lblRetencion = new JLabel("Retención (%):");
        lblRetencion.setBounds(20, 140, 100, 25);
        add(lblRetencion);

        txtRetencion = new JTextField();
        txtRetencion.setBounds(120, 140, 150, 25);
        add(txtRetencion);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 180, 100, 25);
        add(btnCalcular);

        lblSalarioBruto = new JLabel();
        lblSalarioBruto.setBounds(20, 220, 200, 25);
        add(lblSalarioBruto);

        lblSalarioNeto = new JLabel();
        lblSalarioNeto.setBounds(20, 250, 200, 25);
        add(lblSalarioNeto);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
                double valorHora = Double.parseDouble(txtValorHora.getText());
                double retencion = Double.parseDouble(txtRetencion.getText()) / 100;

                double salarioBruto = horasTrabajadas * valorHora;
                double salarioNeto = salarioBruto - (salarioBruto * retencion);

                lblSalarioBruto.setText("Salario Bruto: $" + salarioBruto);
                lblSalarioNeto.setText("Salario Neto: $" + salarioNeto);
            }
        });
    }

    public static void main(String[] args) {
        EmpleadoFormulario formulario = new EmpleadoFormulario();
        formulario.setVisible(true);
    }
}

