package org.kirkplace.xpath.objects;

public class XpathException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	
	public XpathException(String errorMessage){
		super();
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}

}
