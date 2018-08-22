public class Contas {
	private double aReceber;
	private double aPagar;
	
	
	public Contas() {
		this.aReceber = 0.0;
		this.aPagar = 0.0;
	}
	
	public Contas(double aReceber, double aPagar) {
		this.aReceber = aReceber;
		this.aPagar = aPagar;
	}
	
	public double getaReceber() {
		return aReceber;
	}

	public void setaReceber(double valor) {
		this.aReceber += valor;
		}

	public void setNegativoReceber(double valor) {
		this.aReceber -= valor;
		}
	public double getaPagar() {
		return aPagar;
	}

	public void setaPagar(double valor) {
		this.aPagar += valor;
			}
	
	public void setNegativoAPagar(double valor) {
		this.aPagar -= valor;
			}
}
	
