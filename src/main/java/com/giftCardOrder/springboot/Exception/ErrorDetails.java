package com.giftCardOrder.springboot.Exception;

public class ErrorDetails {
	private String errorMessage;
	private int errorCode;
	
	
	public ErrorDetails() {
		super();
	}
	public ErrorDetails(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
