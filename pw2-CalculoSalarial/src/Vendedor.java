
public class Vendedor extends Funcionario
{
	
	private double valorComissao = 20;
	
	Vendedor ven = new Vendedor();

	public void listarFuncionario() 
	{
		ven.setNome("Armando");
		ven.setCpf("12345678910");
		ven.setSalarioBase(15);
		
	}


	public void calcularSalarioFinal(double salarioFinal) 
	{
		salarioFinal = getSalarioBase() + getValorBonificacao() + valorComissao;
	}

	public String apresentarSalario()
	{
		return getNome() + getSalarioBase() + getValorBonificacao() + valorComissao + getSalarioFinal();
	}

}
