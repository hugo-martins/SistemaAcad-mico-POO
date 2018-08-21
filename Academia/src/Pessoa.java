
public class Pessoa {

    private String nome;
    private String email;
    private Telefone telefone;

    public String getEmail() {
        return email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
