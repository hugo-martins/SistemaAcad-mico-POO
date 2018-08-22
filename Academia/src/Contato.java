
public class Contato {

    private Telefone telefone;
    private String email;
    
    public Contato(){
        
    }

    public Contato(Telefone telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

}
