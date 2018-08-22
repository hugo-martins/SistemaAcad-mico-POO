public class Plano {

	private int plano;
	private double valor;

	private final static double PLANO_FAMILIA = 130;
	private final static double PLANO_UNIVERSITARIO = 40;
	private final static double PLANO_PADRAO = 60;
	private final static double PLANO_NATACAO = 100;
	private final static double PLANO_LUTA = 80;

	public double getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(int plano) {

		switch (plano) {
		case 1:
			this.valor = PLANO_FAMILIA;
			break;
		case 2:
			this.valor = PLANO_LUTA;
			break;
		case 3:
			this.valor = PLANO_NATACAO;
			break;
		case 4:
			this.valor = PLANO_PADRAO;
			break;
		case 5:
			this.valor = PLANO_UNIVERSITARIO;
			break;

		}
	}

}
