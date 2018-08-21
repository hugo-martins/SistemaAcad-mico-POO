
/**
 *
 * @author Will
 */
public class Cliente extends Pessoa {

    private Plano plano;//Plano que o cliente ira contratar

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, Telefone telefone, String email, Endereco endereco, String data_nascimento, Plano plano) {
        super(id, nome, cpf, telefone, email, endereco, data_nascimento);
        this.plano = plano;
    }

    public void setPlano(Plano plano) {//pega o plano contratado pelo cliente
        this.plano = plano;
    }

    public Plano getPlano() {//retorna o plano contratado pelo cliente
        return this.plano;
    }

    public String toString() {//retorna os dados do cliente
        return "\nID: " + super.getId() + "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nTelefone: " + super.getTelefone()+"\nEmail: "+super.getEmail()+ "\nEndereco: " + super.getEndereco() + "Plano contratado: " + this.plano;
    }

    boolean isPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPagamento(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
