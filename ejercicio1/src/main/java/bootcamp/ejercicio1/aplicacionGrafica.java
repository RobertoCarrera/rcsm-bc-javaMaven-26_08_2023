package bootcamp.ejercicio1;

import javax.swing.*;
import java.awt.event.*;

public class aplicacionGrafica extends JFrame {
    public aplicacionGrafica() {
    	
        setTitle("Mi Ventana");
        setBounds(400, 300, 250, 250);

        JLabel etiqueta = new JLabel("Hola!");
        add(etiqueta);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}