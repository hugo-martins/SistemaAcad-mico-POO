import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Will
 */
public class Funcionario{
	private double salario;//Salario do Funcionario
	private String cargaHoraria;//Carga Horaria do funcionario
	//private static final String tipo = "funcionario";//Variavel para definir que a pessoa é um funcionario
	private List<Pessoa> funcionarios = new ArrayList<Pessoa>();//Lista de funcionarios
        
	public Funcionario(){}//Construtor vazio
	
	public Funcionario(double salario, String cargaHoraria, Pessoa pessoa){//Construtor
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
                this.funcionarios.add(pessoa);
	}
	
	public void setSalario(double salario) {//pega o salario do funcionario
		this.salario = salario;
	}
	
	public double getSalario() {//retorna o salario do funcionario
		return this.salario;
	}
	
	public void setCargaHorario(String cargaHoraria) {//pega a carga horaria do funcionario
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getCargaHoraria() {//retorna a carga horaria do funcionario
		return this.cargaHoraria;
	}
        
        public void setFuncionario(Pessoa pessoa){//pega o funcionario
            this.funcionarios.add(pessoa);
        }
        
        public List<Pessoa> getFuncionarios(){//retorna a lista de funcionario
            return this.funcionarios;
        }
	
	public String toString() {//retorna os dados do Funcionario
		return "";
	}
}//fim da classe Funcionario
