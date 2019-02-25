
public class ProponenteDigital {

	private String nome;
	private int id;
	private String cpf;

	public ProponenteDigital() {
		super();
	}

	public ProponenteDigital(String nome, int id, String cpf) {
		super();
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
