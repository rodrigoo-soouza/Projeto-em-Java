package Programa;

public class Pessoa {
	
	private static int cont = 1;
	
	public Pessoa(String nome, String cpf, String email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		cont += 1;
	}
	
	private String nome;
	private String cpf;
	private String email;

	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() + 
			   "\nCPF: " + this.getCpf() + 
			   "\nEmail: " + this.getEmail();
	}
	
}
