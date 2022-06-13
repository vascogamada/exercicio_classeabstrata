
public class Atendente extends Funcionario{
	
	private double adicionalNoturno = 20;
	Atendente aten = new Atendente();
	
	public void listarFuncionario() {
		
		aten.setNome("Adailton");
		aten.setCpf("3891749328");
		aten.setSalarioBase(10);
		
	}

	public void calcularSalarioFinal(double salarioFinal) {
		salarioFinal = getSalarioBase() + getValorBonificacao() + adicionalNoturno;
	}


	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao() + adicionalNoturno + getSalarioFinal();
	}

}
