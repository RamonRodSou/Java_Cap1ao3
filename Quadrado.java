package Cap1ao3;
import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero");
		Integer numeroInfo = scanner.nextInt();
		
		Integer quadrado = numeroInfo * numeroInfo;
		
		System.out.println("O quadrado de " + numeroInfo + " é = " + quadrado + ".");
		
		scanner.close();
		
	}
}
