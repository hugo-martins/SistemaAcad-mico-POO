public class contatoNaoExisteException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public contatoNaoExisteException() {
        super();
    }

    public contatoNaoExisteException(String msgErro) {
        super(msgErro);
    }
}
