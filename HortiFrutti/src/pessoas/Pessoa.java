package pessoas;

@SuppressWarnings("unused")
public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//Tratamento
	private void isNegative(int idade) {
		if (idade > 0) {
			setIdade(idade);
		}
	}
	
	private void tratarcpf(String cpf) {
		if (cpf.contains(cpf)) {
			
		}
		if (cpf.length() == 11) {
			
		}
	}
	
}
