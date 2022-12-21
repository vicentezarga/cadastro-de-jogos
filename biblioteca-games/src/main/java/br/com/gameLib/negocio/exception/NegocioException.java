package br.com.gameLib.negocio.exception;

public class NegocioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6112883134648054280L;

	public NegocioException(String msg) {
		super(msg);
	}

	public NegocioException(String msg, Throwable cause) {
		super(msg,cause);
	}

}
