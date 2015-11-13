/**
 * 
 */
package com.keeplearn.exception;

/**
 * @author santosh.chourasiya
 *
 */
public class DuplicateDataException extends RuntimeException{

	private static final long serialVersionUID = 3900699009362842399L;

	public DuplicateDataException() {
		super();
	}

	public DuplicateDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateDataException(String message) {
		super(message);
	}

	public DuplicateDataException(Throwable cause) {
		super(cause);
	}
	
}
