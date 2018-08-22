public class Equipamento {
	private String nome;
	private String tipoEquipamento;
	private double pesoMaterial;
	private int ID;
	private String descricao;
	
	public Equipamento(String nome, String tipoEquipamento, double pesoMaterial, int id, String descricao) {
		super();
		this.nome = nome;
		this.tipoEquipamento = tipoEquipamento;
		this.pesoMaterial = pesoMaterial;
		this.ID = id;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public double getPesoMaterial() {
		return pesoMaterial;
	}

	public void setPesoMaterial(double pesoMaterial) {
		this.pesoMaterial = pesoMaterial;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public String toString() {
		return "Equipamento de nome: " + nome + "\ntipoEquipamento: " + tipoEquipamento + "\npesoMaterial: " + pesoMaterial
				+ "\nID: " + ID + "\ndescricao: " + descricao;
	}
	
	
	
}