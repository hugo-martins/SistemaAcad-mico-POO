public class Funcionario extends Pessoa {

	private double salario;// Salario do Funcionario
	private String cargaHoraria;// Carga Horaria do funcionario
	private boolean pagamento;

	public Funcionario() {
	}// Construtor vazio

	public Funcionario(int id, String nome, String cpf, Contato contato, Endereco endereco, String data_nascimento,
			double salario, String cargaHoraria) {// Construtor
		super(id, nome, cpf, contato, endereco, data_nascimento);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}

	public void setSalario(double salario) {// pega o salario do funcionario
		this.salario = salario;
	}

	public double getSalario() {// retorna o salario do funcionario
		return this.salario;
	}

	public void setCargaHorario(String cargaHoraria) {// pega a carga horaria do funcionario
		this.cargaHoraria = cargaHoraria;
	}

	public String getCargaHoraria() {// retorna a carga horaria do funcionario
		return this.cargaHoraria;
	}

	public String toString() {// retorna os dados do Funcionario
		return  "\nID: " + this.getId() +
				"\nNome: " + super.getNome() +
				"\nCPF: " + super.getCpf() +
				"\nTelefone: (" + super.getContato().getTelefone().getDd() + ") " + super.getContato().getTelefone().getNumero() +
				"\nEmail: " + super.getContato().getEmail() +
				"\n== Endereço ==" +
				"\nEstado: " + super.getEndereco().getEstado() + 
				"\nCidade: " + super.getEndereco().getCidade() +
				"\nLogradouro: " + super.getEndereco().getLogradouro() +
				"\nComplemento: " + super.getEndereco().getComplemento() +
				"\nNúmero: " +  super.getEndereco().getNumero() +
				"\n== salário e carga horária ==" +
				"\nSalario: " + this.salario +
				"\nCarga Horaria: " + this.cargaHoraria;
	}

	public boolean isPagamento() {// retorna o pagamento
		return pagamento;
	}

	public void setPagamento(boolean b) {// muda o pagamento
		this.pagamento = b;
	}
}// fim da classe Funcionario
