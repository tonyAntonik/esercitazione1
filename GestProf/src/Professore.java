
public class Professore{
	String cognome;
	String nome;
	String materia;
	int ore;
	
	public Professore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professore(String cognome, String nome, String materia, int ore) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.materia = materia;
		this.ore = ore;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getOre() {
		return ore;
	}
	public void setOre(int ore) {
		this.ore = ore;
	}
	
	
}
