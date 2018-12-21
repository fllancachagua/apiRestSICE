package pe.gob.bnp.person.common.application;

public class Error {
	private String message;
	private Exception cause;
	
	public Error(){
		
	}
	
	public Error(String message, Exception cause) {
		super();
		this.message = message;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getCause() {
		return cause;
	}

	public void setCause(Exception cause) {
		this.cause = cause;
	}
	
	
}
