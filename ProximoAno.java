package Cap1ao3;
import java.util.Scanner;

public class ProximoAno {
	
	static final Integer NOTA_MINIMA_PARA_PROXIMO_ANO = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua nota do Primeiro Semestre ");
		Double primeiroSem = scanner.nextDouble();
		
		System.out.print("Digite sua nota do Segundo Semestre ");
		Double segundoSem = scanner.nextDouble();
		
		Boolean passouAno = primeiroSem + segundoSem >= NOTA_MINIMA_PARA_PROXIMO_ANO;
		
		if (passouAno) {
			System.out.println("Parabéns! Você passou de ano.");
		} else {
			System.out.println("Infelizmente, ficou de recuperação.");
		}
		
		scanner.close();
		
		
		
	}


}
