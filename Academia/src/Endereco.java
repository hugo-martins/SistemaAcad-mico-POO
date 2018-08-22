public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco(){}

	public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado){
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLogradouro() {
		return this.logradouro;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String toString() {
		return "Logradouro: "+this.logradouro+" n�: "+this.numero+"Bairro: "+this.bairro+"Cidade: "+this.cidade+"Estado: "+this.estado+"Complemento: "+this.complemento;
	}
}
