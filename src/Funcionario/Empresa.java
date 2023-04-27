package Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		this.funcionarios = new ArrayList<>();
	}
	public void cadastrarFuncionario(String nome, int idade, double salario ) {
		Funcionario func1 = new Funcionario(nome, idade, salario);
		funcionarios.add(func1);
		System.out.println("Funcionario cadastrado com sucesso. Matricula: " + func1.getMatricula());
	}
	public void listarFuncionario() {
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println("Matricula: " +funcionario.getMatricula());
	    			
		}
	}
	public Funcionario buscarFuncionarioPorMatricula(int matricula) {
		for(Funcionario f: funcionarios) {
			if (f.getMatricula() ==  matricula) {
				return f;
			}
		}
		return null;
	}
	

}
