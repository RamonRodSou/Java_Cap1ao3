package Cap1ao3;
import java.util.Scanner;

public class Texto {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu Nome ");
		String nome = scanner.nextLine();
	
		System.out.println("Olá " + nome + " Digite [1] para Continuar ou Digite [2] Cancelar" );
		Integer variavelSim = scanner.nextInt();
				
		Boolean avancaSim = variavelSim.equals(1);
		String cpf;
		Integer id;
		String telefone;
		
		if (!avancaSim) {
			
			System.out.print("Digite o CPF");
			cpf = scanner.nextLine();
			
			System.out.print("Digite sua Idade");
			id = scanner.nextInt();
			
			System.out.print("Digite teu Telefone");
			telefone = scanner.nextLine();
			
		}
		
			String insCancelada = null;
			System.out.println("Inscrição encerrada" + insCancelada);
				

	}

}
