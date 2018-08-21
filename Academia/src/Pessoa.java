
/**
 *
 * @author Will
 */
public abstract class Pessoa {

    private int id;//id da pessoa
    private String nome;//nome da pessoa
    private String cpf;//cpf da pessoa
    private Contato contato;//variavel que vai pegar o contato da pessoa
    private Endereco endereco;//variavel que vai pegar o endereco da pessoa
    private String data_nascimento;//data de nascimento da pessoa

    public Pessoa() {
    }//construtor vazio

    public Pessoa(int id, String nome, String cpf, Contato contato, Endereco endereco, String data_nascimento) {//construtor que recebe as informações

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
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

    public void setContato(Contato contato) {//pega o contato da pessoa
        this.contato = contato;
    }

    public Contato getContato() {//retorna o contato da pessoa
        return this.contato;
    }

    public void setEndereco(Endereco endereco) {//pega o endereco da pessoa
        this.endereco = endereco;
    }

    public Endereco getEndereco() {//retorna o endereco da pessoa
        return this.endereco;
    }

}//fim da classe Pessoa
