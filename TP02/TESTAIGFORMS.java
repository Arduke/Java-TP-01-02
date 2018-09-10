package IG;
import java.awt.*;
import javax.swing.JFrame;



public class TESTAIGFORMS extends JFrame{

	public static void main(String[] args) {
	
		

		JFrame janela = new JFrame("TP02");
		janela.setVisible(true);
		janela.setSize(500, 300);
		
		
		Painel meuPainel = new Painel();
		PainelEntrada meuPainel2 = new PainelEntrada();
		PainelCentro meuPainel3 = new PainelCentro();
		
		janela.setLayout(new BorderLayout(10,10));
		
		janela.add(janela.add(meuPainel2),BorderLayout.NORTH);
		janela.add(janela.add(meuPainel),BorderLayout.SOUTH);
		janela.add(janela.add(meuPainel3),BorderLayout.CENTER);
		
		janela.setVisible(true);
		
	}

}
