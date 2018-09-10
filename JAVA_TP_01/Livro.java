public class Livro {

	//atributos
	protected  String titulo;
	protected String autor;
	protected String editora;
	protected short anoedicao;
	//Construtor
	public Livro(String titulo, String autor, String editora, short anoedicao){
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoedicao = anoedicao;
	}
	//propriedades
	public String getTitulo() {
		return titulo;
	}
	public String getAutor(){
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public short getAnoedicao() {
		return anoedicao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public void setAnoedicao(short anoedicao) {
		this.anoedicao = anoedicao;
	}
	
	//metodos
	public String getDados() {
		String aux = "Titulo:" + titulo + " " + "Autor:" + autor + " "+ "Editora: " + editora + " " +"Ano de edicão: "+ anoedicao;
		return aux;
	}
	
}