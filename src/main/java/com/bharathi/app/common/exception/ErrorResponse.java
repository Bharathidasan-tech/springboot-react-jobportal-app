package com.bharathi.app.common.exception;

/**
 * The Class ErrorResponse.
 *
 * @author Bharathidasan
 */
public class ErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * 
	 */
	public ErrorResponse() {
	}
	/**
	 * @param status
	 * @param message
	 * @param timeStamp
	 */
	public ErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	

}
