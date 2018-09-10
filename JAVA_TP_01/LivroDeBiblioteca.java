public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{

	//atributos
	private boolean emprestado;
	private String localizacao;
	
	//propriedades
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public void setLocalizacao(String localizacao) { 
		this.localizacao = localizacao;
	}
	
	//construtor
	public LivroDeBiblioteca(String localizacao, String titulo, String autor, String editora, short anoedicao) {
		super(titulo,autor,editora,anoedicao);
		this.localizacao = localizacao;
		this.emprestado = false;
	}
	//classe Pai
	@Override
	public String getDados() {
		String aux = "Titulo:" + titulo + "\n" + "Autor:" + autor + "\n"+ "Editora: " + editora + "\n" +"Ano de edic�o: "+ anoedicao + "\n" + "Localiza��o: "+ localizacao;
		return aux;
				
	}
	//interface
	public boolean getEmprestado() {
		return emprestado;
	}
	public String getLocaliza��o() {
		return localizacao;
	}
	public void Empresta() {
		this.emprestado = true;
	}
	public void Devolve() {
		this.emprestado = false;
	}
	
	
}
