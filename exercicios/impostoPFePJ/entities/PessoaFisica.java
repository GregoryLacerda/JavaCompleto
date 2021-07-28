package entities;

public class PessoaFisica extends Contribuinte{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculaImposto() {
		
		if (getRendaAnual() <= 20000) {
			return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.50); 
		} else {
			return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.50);
		}
		
	}
}
