
public class contatoNaoExisteException extends Exception {
    public contatoNaoExisteException(){
        super();
    }
    public contatoNaoExisteException(String msgErro){
        super(msgErro);
    }
}
