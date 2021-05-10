package br.com.senai;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	
		Scanner tec = new  Scanner(System.in); 
		System.out.print("informe o primeiro valor: ");
		int primeiro = tec.nextInt();
		System.out.print("informe o segundo valor: ");
		int segundo = tec.nextInt();
		
		int par = 0;
		int impar = 0;
		if(primeiro < segundo) {
			while( segundo <= primeiro ){
				if(primeiro % 2 == 0) {
					par ++ ;
				}
				else {  
					impar ++ ;
				}
		
				segundo++;
				}
			}
		else {
			while(primeiro >= segundo){
				if(primeiro % 2 == 0) {
					par ++ ;
				}
				else {
					impar ++ ; 
			}
		
				primeiro--;
			
		}
		System.out.println("pares: " + par);
		System.out.println("impares: " + impar);
		
	}

}
