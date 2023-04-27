package Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.cadastrarFuncionario("Carlos", 46, 2500.0);
		empresa.cadastrarFuncionario("Reynan", 20, 1000.0);
		
		empresa.listarFuncionario();
		
		Funcionario funcionario1 = empresa.buscarFuncionarioPorMatricula(1);
		Funcionario funcionario2 = empresa.buscarFuncionarioPorMatricula(2);
		
		
		System.out.println("Funcionario 1: " +funcionario1.getNome() + "\nIdade: " + funcionario1.getIdade() + "\n Salario: " + funcionario1.getSalario());
		System.out.println("Funcionario 2: " +funcionario2.getNome() + "\nIdade: " + funcionario1.getIdade() + "\n Salario: " + funcionario2.getSalario());
		
	}

}
