package org.cpm.zerowastelife.commons.response;

public class JsonResponse<T> {

	private Boolean isSuccess;
	private String errorCode;
	private T values;
	private String message;
	
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public T getValues() {
		return values;
	}
	public void setValues(T values) {
		this.values = values;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
