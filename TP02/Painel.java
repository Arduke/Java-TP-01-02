package IG;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Painel extends JPanel{

	Painel(){
		this.setLayout(new GridLayout(1,3));
		this.add(new Button("Limpar"));
		this.add(new Button("Transferir"));
		this.add(new Button("Sair"));
	}
}
