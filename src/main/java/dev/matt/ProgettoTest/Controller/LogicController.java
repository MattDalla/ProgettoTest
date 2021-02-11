package dev.matt.ProgettoTest.Controller;

public class LogicController {
	
	public static int calculate(int primoOp, int secondoOp, String op) {
		switch(op){
		case ("+"):
			return primoOp+secondoOp;	
		case ("-"):
			return primoOp-secondoOp;		
		case ("*"):
			return primoOp*secondoOp;
		case ("x"):
			return primoOp*secondoOp;
		case ("/"):
			return primoOp/secondoOp;
		default: 
			System.out.println("Operazione non riconosciuta.\nPer favore inserisci operazione valida:\n +,\n -,\n x (oppure *),\n /");
			throw new IllegalArgumentException();
		}
		
	}
	
	

}
