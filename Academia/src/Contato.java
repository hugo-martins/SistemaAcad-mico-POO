
public class Contato {

    private String email;
    private Telefone telefone;

    public Contato() {
    	this.email = "";
    	this.telefone = new Telefone();
    }

    public Contato(Telefone telefone, String email) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

}