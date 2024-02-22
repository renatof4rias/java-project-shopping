package Sistema;

public class Cliente {

	public String nome;
	private String cpf;
	private String cep;
	public String bairro;
	public String rua;
	public String casa;
	public String complemento;

	public Cliente() {

	}

	public void setCPF(String cpf) {
		this.cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setCEP(String cep) {
		this.cep = cep.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2-$3");
	}

	public String getCEP() {
		return this.cep;
	}
}