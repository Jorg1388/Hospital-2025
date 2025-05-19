package vistas;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class loginPanel {

    private JPanel loginPanel;

    public loginPanel() {
      loginPanel = new JPanel();
      loginPanel.setSize(500, 800);
      loginPanel.setOpaque(true);
      loginPanel.setBackground(Color.PINK);
      loginPanel.setLayout(new GridBagLayout());

      // ADMINISTRADOR DE DISEÑO - Propiedades generales que vamos a utilizar con los hijos
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.insets = new Insets(10, 80, 10, 80);
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.weightx = 1.0;

    
      //Titulo
      JLabel titulo = new JLabel("Login");
      titulo.setPreferredSize(new Dimension(100, 40));
      titulo.setHorizontalAlignment(SwingConstants.CENTER);
      titulo.setVerticalAlignment(SwingConstants.CENTER);
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.gridwidth = 2;
      gbc.anchor = GridBagConstraints.CENTER;
      loginPanel.add(titulo, gbc);

     //Entrada Correo
     JTextField usuario = new JTextField("Usuario");
     usuario.setPreferredSize(new Dimension(100, 35));
     gbc.gridx = 1;
     gbc.gridy = 1;
     loginPanel.add(usuario, gbc);

     //Entrada Contraseña
     JTextField contraseña = new JTextField("Contraseña");
     contraseña.setPreferredSize(new Dimension(100, 35));
     gbc.gridx = 1;
     gbc.gridy = 2;
     loginPanel.add(contraseña, gbc);

     //botón
     JButton boton = new JButton("Iniciar");
     boton.setSize(new Dimension(100, 70));
     gbc.gridx = 1;
     gbc.gridy = 3;
     gbc.anchor = GridBagConstraints.EAST;
     gbc.fill = GridBagConstraints.NONE;
     loginPanel.add(boton, gbc);
    }
      
    public JPanel getPanel(){
        return loginPanel;
    }
}