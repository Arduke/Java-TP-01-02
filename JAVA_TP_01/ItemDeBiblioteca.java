public interface ItemDeBiblioteca {

	//atributos
	public int diasemprestimo = 7;
	
	//metodos
	public abstract boolean getEmprestado();
	public abstract String getLocaliza��o();
	public void Empresta();
	public void Devolve();
}
