package com.bharathi.app.common.exception;

/**
 * The Class NotFoundException.
 *
 * @author Bharathidasan
 */
public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	public NotFoundException() {
		super();
	}

	/**

	/**
	 * @param message
	 * @param cause
	 */
	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public NotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public NotFoundException(Throwable cause) {
		super(cause);
	}

}
