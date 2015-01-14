package io.switchback.exception;

public class SwitchbackException extends RuntimeException {

	private static final long serialVersionUID = -8604565431731010609L;

	public SwitchbackException() {
		super();
	}

	public SwitchbackException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SwitchbackException(String message, Throwable cause) {
		super(message, cause);
	}

	public SwitchbackException(String message) {
		super(message);
	}

	public SwitchbackException(Throwable cause) {
		super(cause);
	}

}
