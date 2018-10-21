package vo;

public class Paciente extends Pessoa {

	private int cod;
	private String logradouro;
	private int codBairro;
	private int codPessoa;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getCodBairro() {
		return codBairro;
	}

	public void setCodBairro(int codBairro) {
		this.codBairro = codBairro;
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

}
