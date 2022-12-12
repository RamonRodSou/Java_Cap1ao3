package Cap1ao3;
import java.util.Scanner;

public class CalcularValorFinal {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o numero de produtos iguais: ");
		Double quantidadeProduto = scanner.nextDouble();
		
		System.out.print("Digite Valor Pago: ");
		Double valorPago = scanner.nextDouble();

		Double valorSubtotal = valorProduto * quantidadeProduto;
		Boolean quantidadeMaiorOuIgualDez = quantidadeProduto >= 10;
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = valorSubtotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor com desconto: " + valorTotalComDesconto);
		
		Double troco = valorPago - valorTotalComDesconto;
		System.out.println("Troco: " + troco);

		
		scanner.close();
	}

}
