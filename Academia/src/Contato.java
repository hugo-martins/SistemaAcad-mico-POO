
import java.util.ArrayList;
import java.util.List;

public class Contato {

    private List<Pessoa> cadastroContato;

    public Contato() {
        this.cadastroContato = new ArrayList<Pessoa>();
    }

    public void addContato(Pessoa pessoa) throws contatoJaExisteException {

        for (Pessoa p : this.cadastroContato) {
            if (p.getNome().toLowerCase().equals(pessoa.getNome().toLowerCase())) {
                throw new contatoJaExisteException("O você que você tentou cadastrar já existe na nossa base de dados." + pessoa.getNome());
            } else {
                this.cadastroContato.add(p);
            }

        }
    }

    public Pessoa pesquisarContato(String nomePessoa) throws contatoNaoExisteException {
        boolean existir = false;
        for (Pessoa p : this.cadastroContato) {
            if (p.getNome().toLowerCase().equals(nomePessoa.toLowerCase())) {
                existir = true;

                return p;
            }
        }

        throw new contatoNaoExisteException("A pessoa que você pesquisou não está cadastrado na base de dados.");

    }
}
