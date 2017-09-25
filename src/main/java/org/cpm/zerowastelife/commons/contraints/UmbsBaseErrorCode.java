package org.cpm.zerowastelife.commons.contraints;

public enum UmbsBaseErrorCode implements ErrorCodeInterface {

	UNKNOWN_ERROR("UNKNOWN_ERROR", "unknown error"),
	QUERY_ERROR("QUERY_ERROR", "cannot get data from db"),
	ADD_POST_ERROR("ADD_POST_ERROR", "cannot add post to db"),
	DELETE_POST_ERROR("DELETE_POST_ERROR", "cannot delete post in db");
	
	protected String errorCode;
	protected String message;
	
	private UmbsBaseErrorCode(String errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
	}

	@Override
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
