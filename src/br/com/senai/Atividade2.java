package br.com.senai;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
	
		Scanner tec = new  Scanner(System.in);
		System.out.print("informe o primeiro valor: ");
		int primeiroValor = tec.nextInt();
		System.out.print("informe o segundo valor: ");
		String segundoValor = tec.nextInt();
		
		if(primeiroValor < segundoValor ) {
			while(primeiroValor <= segundoValor ) {
			System.out.println(primeiroValor);
			primeiroValor++;
			}
		}else {
			while(primeiroValor > segundoValor) {
				System.out.println(primeiroValor);
				primeiroValor-=1;	
			}
		}
	}		
}
