package bootcamp.ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aplicacionGrafica extends JFrame {
    private JLabel etiqueta;

    public aplicacionGrafica() {
        setTitle("Mi Ventana");
        setBounds(400, 300, 250, 250);

        etiqueta = new JLabel("Has pulsado: ");
        add(etiqueta, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        add(panelBotones, BorderLayout.CENTER);

        JButton boton1 = new JButton("Botón 1");
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Has pulsado: Botón 1");
            }
        });
        panelBotones.add(boton1);

        JButton boton2 = new JButton("Botón 2");
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Has pulsado: Botón 2");
            }
        });
        panelBotones.add(boton2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
