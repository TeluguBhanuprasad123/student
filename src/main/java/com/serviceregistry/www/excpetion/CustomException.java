package com.serviceregistry.www.excpetion;



public class CustomException extends RuntimeException {

	
	  private String errorCode;
	    private int status;
	    
	    
	    
	    
		public String getErrorCode() {
			return errorCode;
		}




		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}




		public int getStatus() {
			return status;
		}




		public void setStatus(int status) {
			this.status = status;
		}




		public CustomException( String message ,String errorCode, int status) {
			super();
			this.errorCode = errorCode;
			this.status = status;
		}




		public CustomException() {
			super();
			// TODO Auto-generated constructor stub
		}


	
}
