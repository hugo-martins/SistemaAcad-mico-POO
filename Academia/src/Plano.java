public class Plano {

	private int plano;
	private double valorPlano;

	private final static double PLANO_FAMILIA = 130;
	private final static double PLANO_UNIVERSITARIO = 40;
	private final static double PLANO_PADRAO = 60;
	private final static double PLANO_NATACAO = 100;
	private final static double PLANO_LUTA = 80;

	public Plano() {
		this.plano = 0;
		this.valorPlano = 0.0;
	}
	
	public int getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}

	public double getValorPlano() {
		return valorPlano;
	}

	public double setValorPlano(int plano) {

		switch (plano) {
		case 1:
			this.valorPlano = PLANO_FAMILIA;
			break;
		case 2:
			this.valorPlano = PLANO_UNIVERSITARIO;
			break;
		case 3:
			this.valorPlano = PLANO_PADRAO;
			break;
		case 4:
			this.valorPlano = PLANO_NATACAO;
			break;
		case 5:
			this.valorPlano = PLANO_LUTA;
			break;

		}
		return valorPlano;
	}
	
	public String nomePlano(int plano) {
		String opcao = "";
		switch (plano) {
		case 1:
			opcao = "Plano Família";
			break;
		case 2:
			opcao = "Plano Universitário";
			break;
		case 3:
			opcao= "Plano Padrão";
			break;
		case 4:
			opcao = "Plano Padrão";
			break;
		case 5:
			opcao = "Plano Universitário";
			break;

		}
		return opcao;
	}
}
