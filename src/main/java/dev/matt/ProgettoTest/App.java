package dev.matt.ProgettoTest;

import java.util.Scanner;

import dev.matt.ProgettoTest.Controller.LogicController;

/**
 * In questa app, cerco di simulare una semplicissima
 * calcolatrice tra numeri interi, senza interfaccia grafica,
 * mi servirà solo per sviluppare alcuni degli HW assegnati
 * nel corso di ISPW 20/21l
 */ 




public class App {
	

    public static void main( String[] args ) {
    	boolean uscita = true;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Ciao, hai bisogno di fare un calcolo veloce? Usami!\nQuando vuoi smettere digita \"exit\" quando ti viene richiesto di inserire l'operatore");
    	while(uscita) {
    	//Istanzia scanner con standard input 
    	//Chiede di introdurre espressione binaria
    	
    	System.out.println("Introduci primo operando");
    	int primoOperando = scan.nextInt(); //qui il programma attende l'immissione di un intero
    	System.out.println("Introduci operatore");
    	String operatore = scan.next(); //qui si attende l'inserimento dell'operatore
    	if(operatore.equals("exit")) {
    		uscita = false;
    		scan.close();
    		return;
    	}
    	System.out.println("Introduci secondo operando");
    	int secondoOperando = scan.nextInt(); //qui il programma attende l'immissione di un secondo intero
    	
		
		
		System.out.println("Il risultato è " + LogicController.calculate(primoOperando, secondoOperando, operatore));
    	}
    	scan.close();
    	return;
 
    
    }    
    
    
}
