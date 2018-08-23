

import javax.swing.JOptionPane;

public class SisGym {

    public static void main(String[] args) {
        
        
        String nomeAcademia = JOptionPane.showInputDialog("Digite o nome da Academia");
        Academia academia = new Academia(nomeAcademia); 
    
        
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
                                + "1 - Dados\n"
                                + "2 - Alterar Nome\n"
                                + "3 - Alterar Contato\n"
                                + "4 - Alterar Endereço\n"
                        		+ "5 - Contas a receber\n"
                                + "6 - Contas a pagar\n"
                                + "0 - Voltar"));

                        switch (escolhaAcademia) {

                            case 1:
                                JOptionPane.showMessageDialog(null, academia.toString());
                                break;
                            case 2:
                                String novoNome = JOptionPane.showInputDialog("Digite o novo nome da Academia: ");
                                academia.setNome(novoNome);
                                JOptionPane.showMessageDialog(null,"O nome da Academia foi alterado para "+ academia.getNome());
                                break;
                            case 3:
                            	String novoEmail = JOptionPane.showInputDialog("Digite o novo email da Academia");
                            	int novoDDD = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo DDD da Academia: "));
                            	int novoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo Telefone da Academia: "));
                            	Telefone novoTelefone = new Telefone (novoNumero, novoDDD);
                            	Contato novoContato = new Contato (novoTelefone, novoEmail);
                            	academia.setContato(novoContato);
                                JOptionPane.showMessageDialog(null,"O Telefone da Academia foi alterado para "+ academia.getContato().getTelefone().getDd() + " " + academia.getContato().getTelefone().getNumero());
                                JOptionPane.showMessageDialog(null, "O Email da Academia foi alterado para "+ academia.getContato().getEmail());
                                 break;
                            case 4:
                            	String novoLogradouroAcademia = JOptionPane.showInputDialog("Digite o Logradouro da Academia");
                                int novoNumeroAcademia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da Academia"));
                                String novoComplementoAcademia = JOptionPane.showInputDialog("Digite o Complemento");
                                String novoBairroAcademia = JOptionPane.showInputDialog("Digite o Bairro da Academia");
                                String novaCidadeAcademia = JOptionPane.showInputDialog("Digite a Cidade da Academia");
                                String novoEstadoAcademia = JOptionPane.showInputDialog("Digite o Estado da Academia");
                                
                                Endereco novoEdereco = new Endereco(novoLogradouroAcademia, novoNumeroAcademia, novoComplementoAcademia,novoBairroAcademia, novaCidadeAcademia, novoEstadoAcademia);
                                academia.setEndereco(novoEdereco);
                                
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Você tem R$ " + academia.getContas().getaReceber() + " para receber até o fim do mês.");
                                break;
                            case 6:
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
                        int escolhaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Menu Funcionários " + academia.getNome() + "\n"
                                + "1 - Cadastrar\n"
                                + "2 - Listar\n"
                                + "3 - A Pagar\n"
                                + "4 - Efetuar Pagamento \n"
                                + "0 - Voltar"));

                        switch (escolhaFuncionario) {

                            case 1:
                                int id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                                String nome = JOptionPane.showInputDialog("Nome: ");
                                String CPF = JOptionPane.showInputDialog("CPF: ");
                                int ddd = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                                int numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                                String emailFun = JOptionPane.showInputDialog("Email: ");
                                String dataNasciFunc = JOptionPane.showInputDialog("Data de Nascimento: ");
                                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                                String cargaHoraria = JOptionPane.showInputDialog("Carga Horária: ");
                                
                                String estadoFunc = JOptionPane.showInputDialog("Estado do funcionário: ");
                                String cidadeFunc = JOptionPane.showInputDialog("Cidade: ");
                                String logradouroFunc = JOptionPane.showInputDialog("Logradouro: ");
                                int numeroFunc = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
                                String complementoFunc = JOptionPane.showInputDialog("Complemento: ");
                                String bairroFunc = JOptionPane.showInputDialog("Bairro: ");

                                Telefone tel = new Telefone(numeroTel, ddd);
                                Contato contato = new Contato(tel,emailFun);
                                Endereco enderecoFunc = new Endereco(logradouroFunc, numeroFunc, complementoFunc, bairroFunc, cidadeFunc, estadoFunc);
                                Funcionario f = new Funcionario(id, nome, CPF,contato,enderecoFunc,dataNasciFunc, valor, cargaHoraria);
                                academia.cadastrarFuncionario(f);

                                break;

                            case 2:

                                String lista = "Lista de Funcionários da Academia " + academia.getNome() + ":\n";
                                for (Funcionario l : academia.getFuncionarios()) {
                                    lista += l.toString() + ", \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);

                                break;
                            case 3:
                                String listaFuncionariosPagar = "Lista de Funcionários a pagar: \n";
                                for (Funcionario fp : academia.getFuncionarios()) {
                                    if (!fp.isPagamento()) {
                                        listaFuncionariosPagar += fp.toString() + "\n";
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
                	
                	boolean sairEquipamento = false;
                    while (!sairEquipamento) {
                        int escolhaEquipamento = Integer.parseInt(JOptionPane.showInputDialog("Menu de Equipamentos da Academia " + academia.getNome() + "\n"
                                + "1 - Cadastrar\n"
                                + "2 - Remover\n"
                                + "3 - Listar\n"
                                + "0 - Voltar"));
                	
                        	switch (escolhaEquipamento) {
                        	
                        	case 1:
                        		
                        		int IdEquipamento = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID para o Equipamento: "));
                        		String nomeEquipamento = JOptionPane.showInputDialog("Digite o nome do Equipamento:");
                        		String tipoEquipamento = JOptionPane.showInputDialog("Digite o tipo do Equipamento:");
                        		double pesoMaterial = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do material:"));
                        		String descricaoEquipamento = JOptionPane.showInputDialog("Digite a descrição do equipamento");
                        		Equipamento e = new Equipamento(nomeEquipamento, tipoEquipamento, pesoMaterial, IdEquipamento, descricaoEquipamento);
                        		academia.cadastrarEquipamento(e);
                        	
                        	break;
                        		
                        	case 2:
                        		
                        		int idEquipamentoRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Equipamento para remover"));
                        		academia.removerEquipamento(idEquipamentoRemover);
                        		System.out.println(idEquipamentoRemover);
                        		
                        	break;
                        	
                        	case 3:
                        		
                        		String listaEquipamentos = "Lista de Equipamentos da Academia "+ academia.getNome()+ "\n";
                                for (Equipamento eq : academia.getEquipamentos()) {
                                		listaEquipamentos += eq.toString() + "\n";
                                    }
                                JOptionPane.showMessageDialog(null, listaEquipamentos);
                        		
                        		
                        	break;
                        	
                        	case 0:
                        		
                        		sairEquipamento = true;
                        		
                        		break;
                        		
                        		}
                        	}
   
                    break;
                    

                case 4: //cliente
                    boolean sairCliente = false;
                    while (!sairCliente) {
                        int escolhaCliente = Integer.parseInt(JOptionPane.showInputDialog("Menu Clientes " + academia.getNome() + "\n"
                                + "1 - Cadastrar\n"
                                + "2 - Listar\n"
                                + "3 - A Receber\n"
                                + "4 - Efetuar Pagamento \n"
                                + "0 - Voltar"));

                        switch (escolhaCliente
                        		
                        		) {

                            case 1:
                                Plano planoCliente = new Plano();
                                int id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                                String nomeCliente = JOptionPane.showInputDialog("Nome: ");
                                String CPFCliente = JOptionPane.showInputDialog("CPF: ");
                                int dddCliente = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                                int numeroTelCliente = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                                String emailCliente = JOptionPane.showInputDialog("Email: ");
                                String dataNasciCliente = JOptionPane.showInputDialog("Data de Nascimento: ");
                                
                                String estadoCliente = JOptionPane.showInputDialog("Estado do cliente: ");
                                String cidadeCliente = JOptionPane.showInputDialog("Cidade: ");
                                String logradouroCliente = JOptionPane.showInputDialog("Logradouro: ");
                                int numeroCliente = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
                                String complementoCliente = JOptionPane.showInputDialog("Complemento: ");
                                String bairroCliente = JOptionPane.showInputDialog("Bairro: ");
                                
                                int opcaoPlano = Integer.parseInt(JOptionPane.showInputDialog("Opções de Plano:"
                                		+ "\n1-Plano Família"
                                		+ "\n2-Plano Universitário"
                                		+ "\n3-Plano Padrão"
                                		+ "\n4-Plano Natação"
                                		+ "\n5-Plano Luta"));
                                planoCliente.setPlano(opcaoPlano);
                                //double valor = planoCliente.setValorPlano((int) planoCliente.getPlano());
                                Telefone telCliente = new Telefone(numeroTelCliente, dddCliente);
                                Contato contatoCliente = new Contato(telCliente,emailCliente);
                                Endereco enderecoCliente = new Endereco(logradouroCliente, numeroCliente, complementoCliente, bairroCliente, cidadeCliente, estadoCliente);
                                Cliente c = new Cliente(id,nomeCliente, CPFCliente, contatoCliente, enderecoCliente, dataNasciCliente, planoCliente);
                                academia.cadastrarCliente(c);
                                break;

                            case 2:

                                String lista = "Lista de Clientes da Academia " + academia.getNome() + ":\n";
                                for (Cliente l : academia.getClientes()) {
                                    lista += l.toString()+ ", \n";
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
                               try {
                                    String cpfClientePagar = JOptionPane.showInputDialog("CPF: ");
                                    JOptionPane.showMessageDialog(null, academia.clientePagar(cpfClientePagar));
                                } catch (cpfNaoExisteException e) {
                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                }
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
