
public class Gerente extends Funcionario
{
	private double gratificacao = 10;
	

	
	public void listarFuncionario() 
	{
		Gerente ger = new Gerente();
		
		ger.setNome("Adailton");
		ger.setCpf("3891749328");
		ger.setSalarioBase(10);
	}

	public void calcularSalarioFinal(double salarioFinal) 
	{
		salarioFinal = getSalarioBase() + getValorBonificacao() + gratificacao;

	}

	public String apresentarSalario()
	{ 
		return getNome() + getSalarioBase() + getValorBonificacao() + gratificacao + getSalarioFinal();
	}
		
}
