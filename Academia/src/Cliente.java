
/**
 *
 * @author Will
 */
public class Cliente extends Pessoa {
    private Plano plano;//Plano que o cliente ira contratar
    private boolean pagamento;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, Contato contato, Endereco endereco, String data_nascimento, Plano plano) {
        super(id, nome, cpf, contato, endereco, data_nascimento);
        this.plano = plano;
    }

    public void setPlano(Plano plano) {//pega o plano contratado pelo cliente
        this.plano = plano;
    }

    public Plano getPlano() {//retorna o plano contratado pelo cliente
        return this.plano;
    }

    public boolean isPagamento(){//retorna o pagamento
        return pagamento;
    }

    public void setPagemento(boolean b){//muda o pagamento
        this.pagamento = b;
    }

    public String toString() {//retorna os dados do cliente
        return "\nID: " + super.getId() + "\nNome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nContato: " + super.getContato() + "\nEndereco: " + super.getEndereco() + "Plano contratado: " + this.plano;
    }
}
