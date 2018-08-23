public class contatoJaExisteException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public contatoJaExisteException() {
        super();
    }

    public contatoJaExisteException(String msgErro) {
        super(msgErro);
    }
}
