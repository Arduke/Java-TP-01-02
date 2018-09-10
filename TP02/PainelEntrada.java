package IG;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PainelEntrada extends JPanel {

	PainelEntrada(){
		
	    
		
		
		JTextField nomeUsuario = new JTextField(20);
	    nomeUsuario.setBounds(15, 10, 20, 5);
	    this.setBackground(Color.green);
		JLabel label = new JLabel();
	    label.setText("ENTRADA:  ");
	    this.add(label);
	    this.add(nomeUsuario);
	}
}
