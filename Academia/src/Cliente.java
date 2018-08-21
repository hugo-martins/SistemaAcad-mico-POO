import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Will
 */
public class Cliente{
	private String plano;//Plano que o cliente ira contratar
        private List<Pessoa> clientes = new ArrayList<Pessoa>();
	//private static final String tipo = "cliente";//variavel para definir o tipo
	
	public Cliente() {}
	
	public Cliente(String plano, Pessoa pessoa){
            this.plano = plano;
            this.clientes.add(pessoa);
	}
	
	public void setPlano(String plano) {//pega o plano contratado pelo cliente
            this.plano = plano;
	}
	
	public String getPlano() {//retorna o plano contratado pelo cliente
            return this.plano;
	}
        
        public void setCliente(Pessoa pessoa){
            this.clientes.add(pessoa);
        }
        
        public List<Pessoa> getCliente(){
            return this.clientes;
        }
	public String toString() {//retorna os dados do cliente
		return "";
	}
}
