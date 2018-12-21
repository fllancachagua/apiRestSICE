package pe.gob.bnp.person.common.application;

import java.util.ArrayList;
import java.util.List;

public class Notification {
	private List<Error> errors = new ArrayList<Error>();

	public void addError(String message){
		errors.add(new Error(message, null));
	}
	
	public void addError(String message, Exception e){
		errors.add(new Error(message, e));
	}
	
	public String errorMessage(){
		String resultado = "";
		for (int i = 0; i < errors.size(); i++) {
			if ( (i+1)!=errors.size()){
				resultado = resultado + errors.get(i).getMessage()+", ";
			}else{
				resultado = resultado + errors.get(i).getMessage();
			}
				
			 
		}
		return resultado;		
	}
	
	public boolean hasErrors(){
		return !errors.isEmpty();
	}
}
