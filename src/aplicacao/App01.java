package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servico.TaxaServico;
import servico.TaxaServicoUsa;


public class App01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.print("Quantia");
		double quantia= sc.nextDouble();
		System.out.print("Meses");
		int meses= sc.nextInt();
		
		TaxaServico  is= new TaxaServicoUsa (1.0);
		double pagamento= is.pagamento(quantia, meses);
		
		
		System.out.println("Pagamento apos "+ meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();

		
	}

}
