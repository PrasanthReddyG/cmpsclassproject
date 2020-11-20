package com.subr.cmps.util;

public class ErrorResponse {

	private String errorCode;
	private String errorResponse;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorResponse() {
		return errorResponse;
	}
	public void setErrorResponse(String errorResponse) {
		this.errorResponse = errorResponse;
	}
	@Override
	public String toString() {
		return "ErrorResponse [errorCode=" + errorCode + ", errorResponse=" + errorResponse + "]";
	}
	
	
}
