import javax.swing.JOptionPane;

public class SisGym {

    static int id_;
    public static void main(String[] args) {
        Academia academia = new Academia();

        boolean sair = false;
        while (!sair) {
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu Academia " + academia.getNome() + "\n"
                    + "1 - Academia\n"
                    + "2 - Funcionários\n"
                    + "3 - Equipamentos\n"
                    + "4 - Clientes\n"
                    + "0 - Sair"));

            switch (escolha) {

                case 1:

                    boolean sairAcademia = false;
                    while (!sairAcademia) {

                        int escolhaAcademia = Integer.parseInt(JOptionPane.showInputDialog("Menu Academia " + academia.getNome() + "\n"
                                + "1 - Contas a receber\n"
                                + "2 - Contas a pagar\n"
                                + "0 - Sair"));

                        switch (escolhaAcademia) {

                            case 1:
                                JOptionPane.showMessageDialog(null, "Você tem R$ " + academia.getContas().getaReceber() + " para receber até o fim do mês.");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Você tem R$ " + academia.getContas().getaPagar() + " para pagar até o fim do mês.");
                                break;
                            case 0:
                                sairAcademia = true;
                        }
                    }
                    break;

                case 2:

                    boolean sairFuncionario = false;
                    while (!sairFuncionario) {
                        int escolhaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Menu Funcionarios " + academia.getNome() + "\n"
                                + "1 - Cadastrar\n"
                                + "2 - Listar\n"
                                + "3 - A Pagar\n"
                                + "4 - Efetuar Pagamento \n"
                                + "0 - Sair"));

                        switch (escolhaFuncionario) {

                            case 1:
                                //Tratamento de erro do ID. Mesmo se o usuário digitar uma String ele converto em int.
                                boolean teste = false;
                                boolean validacao=true;
                                
                                while(validacao){
                                String id = JOptionPane.showInputDialog("ID: ");
                                if(id.equals("")){
                                    System.err.println("Valor Nulo!");
                                    teste= false;
                                }else if(id.length() >= 999){
                                    /*
                                    Regra de 1 a 999 nunca maior que 4 caracteres
                                    */
                                    System.err.println("Isto é um ID?");
                                    teste=false;
                                }else{
                                
                                     int id_ = Integer.parseInt(id);
                                     System.out.print("Id;"+ id_);
                                    teste=true;
                                }
                                if(teste){
                                String nome = JOptionPane.showInputDialog("Nome: ");
                                String CPF = JOptionPane.showInputDialog("CPF: ");
                                int ddd = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                                int numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                                String emailFun = JOptionPane.showInputDialog("Email: ");
                                String dataNasciFunc = JOptionPane.showInputDialog("Data de Nascimento: ");
                                double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                                String cargaHoraria = JOptionPane.showInputDialog("Carga Horaria: ");
                                
                                
                                Telefone telFuncionario = new Telefone(numeroTel, ddd);
                                Funcionario f = new Funcionario(id_, nome, CPF,telFuncionario,emailFun,null,dataNasciFunc, salario, cargaHoraria);
                                academia.cadastrarFuncionario(f);
                                validacao=false;
                                break;
                                }
                                }
                                
                              

                            case 2:

                                String lista = "Lista de Funcionários da Academia " + academia.getNome() + ":\n";
                                for (Funcionario l : academia.getFuncionarios()) {
                                    lista += l.getNome() + ", \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);

                                break;
                            case 3:
                                String listaFuncionariosPagar = "Lista de Funcionários a pagar: \n";
                                for (Funcionario fp : academia.getFuncionarios()) {
                                    if (!fp.isPagamento()) {
                                        listaFuncionariosPagar += fp.getNome() + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, listaFuncionariosPagar);
                                break;

                            case 4:
                                String cpfFuncionarioAPagar = JOptionPane.showInputDialog("CPF: ");
                                JOptionPane.showMessageDialog(null, academia.pagarFuncionario(cpfFuncionarioAPagar));
                                break;

                            case 0:
                                sairFuncionario = true;
                                break;

                        }
                    }
                    break;
                /////
                case 3:
                    break;

                case 4: //cliente
                    boolean sairCliente = false;
                    while (!sairCliente) {
                        int escolhaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Menu Clientes " + academia.getNome() + "\n"
                                + "1 - Cadastrar\n"
                                + "2 - Listar\n"
                                + "3 - A Receber\n"
                                + "4 - Efetuar Pagamento \n"
                                + "0 - Sair"));

                        switch (escolhaFuncionario) {

                            case 1:

                                //Tratamento de erro do ID. Mesmo se o usuário digitar uma String ele converto em int.
                                boolean teste = false;
                                boolean validacao=true;
                                
                                while(validacao){
                                String id = JOptionPane.showInputDialog("ID: ");
                                if(id.equals("")){
                                    System.err.println("Valor Nulo!");
                                    teste= false;
                                }else if(id.length() >= 999){
                                    /*
                                    Regra de 1 a 999 nunca maior que 4 caracteres
                                    */
                                    System.err.println("Isto é um ID?");
                                    teste=false;
                                }else{
                                
                                     int id_ = Integer.parseInt(id);
                                     System.out.print("Id;"+ id_);
                                    teste=true;
                                }
                                if(teste){
                                String nomeCliente = JOptionPane.showInputDialog("Nome: ");
                                String CPFCliente = JOptionPane.showInputDialog("CPF: ");
                                int dddCliente = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                                int numeroTelCliente = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                                String emailCliente = JOptionPane.showInputDialog("Email: ");
                                String dataNasciCliente = JOptionPane.showInputDialog("Data de Nascimento: ");
                                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                             
                                Telefone telCliente = new Telefone(numeroTelCliente, dddCliente);
                                Cliente c = new Cliente(id_,nomeCliente,CPFCliente,telCliente,emailCliente,null, dataNasciCliente, null);
                                academia.cadastrarCliente(c);
                                }
                                }
                                break;

                            case 2:

                                String lista = "Lista de Clientes da Academia " + academia.getNome() + ":\n";
                                for (Cliente l : academia.getClientes()) {
                                    lista += l.getNome() + ", \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);

                                break;
                            case 3:
                                String listaClientesDevendo = "Lista de Clientes Devendo: \n";
                                for (Cliente cp : academia.getClientes()) {
                                    if (!cp.isPagamento()) {
                                        listaClientesDevendo += cp.getNome() + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, listaClientesDevendo);
                                break;

                            case 4:
                                String cpfClientePagar = JOptionPane.showInputDialog("CPF: ");
                                JOptionPane.showMessageDialog(null, academia.clientePagar(cpfClientePagar));
                                break;

                            case 0:
                                sairCliente = true;
                                break;
                        }
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado");
                    sair = true;
            }
        }
    }

}
