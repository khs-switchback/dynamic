package io.switchback.exception;

public class SwitchBackResourceNotFoundException extends SwitchbackException {

	private static final long serialVersionUID = -4195740449813070228L;

	public SwitchBackResourceNotFoundException() {
		super();
	}

	public SwitchBackResourceNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SwitchBackResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SwitchBackResourceNotFoundException(String message) {
		super(message);
	}

	public SwitchBackResourceNotFoundException(Throwable cause) {
		super(cause);
	}
}
