package servico;

import java.security.InvalidParameterException;

public class TaxaServicoBrasil implements TaxaServico {
	private double taxaJuros;

	public TaxaServicoBrasil(double taxaJuros) {
		
		this.taxaJuros = taxaJuros;
	}
	@Override

	public double getTaxaJuros() {
		return taxaJuros;
	}
	@Override
	public double pagamento(double quantia, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Quantidade de meses deve ser maior que zero");
			
		}
		return quantia * Math.pow(1.0 + taxaJuros/ 100.0, meses);
		
	}
}
