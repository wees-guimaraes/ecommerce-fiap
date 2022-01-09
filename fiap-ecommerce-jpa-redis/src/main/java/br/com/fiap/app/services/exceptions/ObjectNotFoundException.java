package br.com.fiap.app.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 6907603781144149710L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
