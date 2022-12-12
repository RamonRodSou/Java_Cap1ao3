package Cap1ao3;
import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite teu nome completo ");
		String nome = scanner.nextLine();
		

		Boolean variavelSim = true;
		Boolean variavelNao = false;
	
		System.out.print("Olá " + nome + ", Digite( true ) para processeguir " + variavelSim + " "
				+ " e ( false ) para finalizar" + variavelNao);
		
		if (variavelSim) {
			
			System.out.print("Digite seu Cpf ");
			String cpfPessoa = scanner.nextLine();

			System.out.print("Digite sua Idade ");
			Integer idadePessoa = scanner.nextInt();
			
		}


		scanner.close();
		
	}
}
