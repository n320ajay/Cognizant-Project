package com.cognizant.exception;
//2nd changes to check
/**
 * Class for handling UserNameNumericException
 */
public class UserNameNumericException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * This method sets the custom error message
	 * 
	 * @param message
	 */
	public UserNameNumericException(String message) {
		super(message);
	}

}
