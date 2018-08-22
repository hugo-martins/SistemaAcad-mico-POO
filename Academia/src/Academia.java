
import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nome;
    private Endereco endereco;
    private Contato contato;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private Contas contas;
    private List<Cliente> clientesDevendo = new ArrayList<>();

    public Academia(String nome, Endereco endereco, Contato contato, List<Cliente> clientes, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
        this.contas = new Contas();
    }

    Academia() {
        this.nome = nome;
        this.contato = new Contato();
        this.endereco = new Endereco();
        this.clientes = new ArrayList<Cliente>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.contas = new Contas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void cadastrarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        this.contas.setaPagar(f.getSalario());
    }

    public Contas getContas() {
        return contas;
    }

    public void setContas(Contas contas) {
        this.contas = contas;
    }

    public void removerFuncionario(String CpfFuncionario) {
        for (Funcionario f : this.funcionarios) {
            if (f.getCpf().equals(CpfFuncionario)) {
                funcionarios.remove(f);
            }
        }
    }

    public void setReceberCliente(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            if (!c.isPagamento()) {
                this.contas.setaReceber(c.getValor());
            }
        }
    }

    public void setDispesaFuncionario(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            if (!f.isPagamento()) {
                this.contas.setaPagar(f.getSalario());
            }
        }
    }

    public String pagarFuncionario(String CPF) {
        for (Funcionario f : this.funcionarios) {
            if (f.getCpf().equals(CPF)) {
                if (!f.isPagamento()) {
                    f.setPagamento(true);
                }
            }
            this.contas.setNegativoAPagar(f.getSalario());
            return "Funcionário pago com sucesso!";
        }
        return "Funcionário já foi pago esse mês";
    }

    public void cadastrarCliente(Cliente c) {
        this.clientes.add(c);
        this.contas.setaReceber(c.getValor());
    }

    public String clientePagar(String CPF) {
        for (Cliente c : this.clientes) {
            if (c.getCpf().equals(CPF)) {
                if (!c.isPagamento()) {
                    c.setPagamento(true);
                }
            }
            this.contas.setNegativoReceber(c.getValor());
            return "Mensalidade paga com sucesso!";
        }
        return "Mensalidade ja foi paga esse mês";
    }

    public List<Cliente> getclientesDevendo() {
        for (Cliente cd : this.clientes) {
            if (!cd.isPagamento()) {
                this.clientesDevendo.add(cd);
                return this.clientesDevendo;
            }
        }
        return null;
    }
}
