import java.util.List;


public class Contato {
    
   private String email;
   private double telefone;
   private List<Contato> cadastroEmail;
   private List<Contato> cadastroTelefone;
   
   public Contato(){}

    public Contato(String email, double telefone,List<Contato> cadastroEmail, List<Contato> cadastroTelefone) {
        this.email = email;
        this.telefone = telefone;  
        this.cadastroEmail = cadastroEmail;
        this.cadastroTelefone = cadastroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public double getTelefone() {
        return telefone;
    }
    
 public List<Contato> getCadastroEmail() {
        return cadastroEmail;
    }
    public List<Contato> getCadastroTelefone() {
        return cadastroTelefone;
    }
    public void setEmail(String email) {
        this.email = email;  
    }
    
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    
    public void setCadastroEmail(List<Contato> cadastroEmail) {
        this.cadastroEmail = cadastroEmail;
    }

    public void setCadastroTelefone(List<Contato> cadastroTelefone) {
        this.cadastroTelefone = cadastroTelefone;
    }
  
  
    public void cadastrarEmail(Contato email) throws contatoJaExisteException{
       boolean existe = false;
       for(Contato E: this.cadastroEmail){
           if(E.getEmail().equals(email)){
                existe = true;
                break;
           }
       }
       if (!existe){         
        this.cadastroEmail.add(email);        
        }
        else{
            throw new contatoJaExisteException("O email que você tentou cadastrar já existe na nossa base de dados."+getEmail());
        }                    
                             
    }
    public Contato pesquisarEmail(Contato nomeEmail)throws contatoNaoExisteException{
        boolean existir = false;
        for(Contato A: this.cadastroEmail){
            if(A.getEmail().equals(nomeEmail)){
                existir = true;              
                return A; 
               
            }
        }
    throw new contatoNaoExisteException("O email não está cadastrado na base de dados."+getEmail());
                  
    }
    
    
    public void cadastrarTelefone(Contato telefone) throws contatoJaExisteException{
       boolean existe = false;
       for(Contato T: this.cadastroTelefone){
           if(T.equals(telefone)){
              existe = true;
              break;
           }
       }
       if (!existe){         
        this.cadastroTelefone.add(telefone);        
        }
        else{
            throw new contatoJaExisteException("O telefone que você tentou cadastrar já existe na nossa base de dados."+getTelefone());
        }                    
                             
    }
    
    public Contato pesquisarTelefone(Contato numTelefone)throws contatoNaoExisteException{
        boolean existir = false;
        for(Contato Tel: this.cadastroEmail){
            if(Tel.equals(numTelefone)){
                existir = true;              
                return Tel; 
               
            }
        }
    throw new contatoNaoExisteException("O telefone não está cadastrado na base de dados."+getTelefone());
                  
    }
}
   
