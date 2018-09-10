package BL;

public class TESTE {

	public static void main (String[] args) {
		
		LivroDeBiblioteca l1 = new LivroDeBiblioteca ("GLLp17","Introdução à POO usando JAVA", "Prof.Rafael Santos" ,"Campus/SBC",(short)2003);
		
		l1.getDados();
		
		System.out.println(l1.getDados());
		
	}
}
