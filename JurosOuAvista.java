package Cap1ao3;
import java.util.Scanner;

public class JurosOuAvista {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o Valor do Produto ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = parcelado ]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean valorAvista = tipoPagamento.equals(1);
		Double juros = 0.0;
		
		if (!valorAvista) {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor Total = " + valorTotal ) ;
		
		scanner.close();
		
		
	}

}
