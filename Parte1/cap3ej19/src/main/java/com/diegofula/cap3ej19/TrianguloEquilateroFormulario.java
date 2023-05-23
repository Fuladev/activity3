/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegofula.cap3ej19;

/**
 *
 * @author Diego Fula
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilateroFormulario extends JFrame {
    private JLabel lblLado, lblPerimetro, lblAltura, lblArea;
    private JTextField txtLado;
    private JButton btnCalcular;
    private JPanel panelImagen;

    public TrianguloEquilateroFormulario() {
        setTitle("Triángulo Equilátero");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblLado = new JLabel("Lado:");
        lblLado.setBounds(20, 20, 80, 25);
        add(lblLado);

        txtLado = new JTextField();
        txtLado.setBounds(120, 20, 150, 25);
        add(txtLado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 60, 100, 25);
        add(btnCalcular);

        lblPerimetro = new JLabel();
        lblPerimetro.setBounds(20, 100, 200, 25);
        add(lblPerimetro);

        lblAltura = new JLabel();
        lblAltura.setBounds(20, 130, 200, 25);
        add(lblAltura);

        lblArea = new JLabel();
        lblArea.setBounds(20, 160, 200, 25);
        add(lblArea);

        panelImagen = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int lado = Integer.parseInt(txtLado.getText());
                int x1 = getWidth() / 2;
                int y1 = 50;
                int x2 = x1 - lado / 2;
                int y2 = y1 + lado;
                int x3 = x1 + lado / 2;
                int y3 = y1 + lado;
                g.drawLine(x1, y1, x2, y2);
                g.drawLine(x2, y2, x3, y3);
                g.drawLine(x3, y3, x1, y1);
            }
        };
        panelImagen.setBounds(20, 200, 300, 150);
        add(panelImagen);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int lado = Integer.parseInt(txtLado.getText());

                double perimetro = lado * 3;
                double altura = Math.sqrt(Math.pow(lado, 2)- Math.pow((lado / 2), 2));
                double area = (lado * altura) / 2;

                lblPerimetro.setText("Perímetro: " + perimetro);
                lblAltura.setText("Altura: " + altura);
                lblArea.setText("Área: " + area);

                panelImagen.repaint();
            }
        });
    }

    public static void main(String[] args) {
        TrianguloEquilateroFormulario formulario = new TrianguloEquilateroFormulario();
        formulario.setVisible(true);
    }
}

