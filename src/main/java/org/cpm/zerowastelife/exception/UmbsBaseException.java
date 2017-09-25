package org.cpm.zerowastelife.exception;

import org.cpm.zerowastelife.commons.contraints.ErrorCodeInterface;

public class UmbsBaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3269056001521410907L;
	
	protected String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public UmbsBaseException(ErrorCodeInterface errorCode) {
		super(errorCode.getMessage());
	}
	
	public UmbsBaseException(ErrorCodeInterface errorCode, String message) {
		super(message);
		this.errorCode = errorCode.getErrorCode();
	}
	
}
