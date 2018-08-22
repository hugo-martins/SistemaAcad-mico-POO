/**
 *
 * @author Will
 */
public abstract class Pessoa {

    private int id;//id da pessoa
    private String nome;//nome da pessoa
    private String cpf;//cpf da pessoa
    private String email;//variavel que pega email
    private Telefone telefone;//variavel que vai pegar o telefone da pessoa
    private Endereco endereco;//variavel que vai pegar o endereco da pessoa
    private String data_nascimento;//data de nascimento da pessoa

    public Pessoa() {}//construtor vazio

    public Pessoa(int id, String nome, String cpf, Telefone telefone,String email, Endereco endereco, String data_nascimento) {//construtor que recebe as informações

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.data_nascimento = data_nascimento;
    }

    public void setId(int id) {//pega o id
        this.id = id;
    }

    public int getId() {//retorna o id
        return this.id;
    }

    public void setNome(String nome) {//pega o nome da pessoa
        this.nome = nome;
    }

    public String getNome() {//retorna o nome da pessoa
        return this.nome;
    }

    public void setCpf(String cpf) {//pega o cpf da pessoa
        this.cpf = cpf;
    }

    public String getCpf() {//retorna o cpf da pessoa
        return this.cpf;
    }

    public void setTelefone(Telefone telefone) {//pega o contato da pessoa
        this.telefone = telefone;
    }

    public Telefone getTelefone() {//retorna o contato da pessoa
        return this.telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {//pega o endereco da pessoa
        this.endereco = endereco;
    }

    public Endereco getEndereco() {//retorna o endereco da pessoa
        return this.endereco;
    }

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
    
    

}//fim da classe Pessoar
