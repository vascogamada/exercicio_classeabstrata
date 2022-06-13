import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		Atendente atendente = new Atendente();
		
		Scanner sca = new Scanner(System.in);
		
		System.out.printf("Digite qual tipo você é: \n 1- Gerente\n 2- Vendedor\n Atendente");
		int opcao = sca.nextInt();
		
		switch(opcao) {
		
		case 1: System.out.printf("Gerente");
			
		case 2: System.out.printf("Vendedor");

		case 3: System.out.printf("Atendente");
		
		break;
		}
	}
}
