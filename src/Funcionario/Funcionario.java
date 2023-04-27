package Funcionario;

public class Funcionario {
	
	private static int proxMatricula=1;
	private int matricula;
	private String nome;
	private int idade;
	private double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.matricula = proxMatricula++;
		this.idade = idade;
		this.nome = nome;
		this.salario = salario;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
