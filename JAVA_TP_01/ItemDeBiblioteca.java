public interface ItemDeBiblioteca {

	//atributos
	public int diasemprestimo = 7;
	
	//metodos
	public abstract boolean getEmprestado();
	public abstract String getLocalização();
	public void Empresta();
	public void Devolve();
}
