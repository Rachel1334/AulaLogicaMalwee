package br.com.senai;

import java.util.Scanner;

public class MenuRepete {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu; 
		do {
			System.out.println("----MENU----");
			System.out.println("1) TABUADA COM DO WHILE");
			System.out.println("2) TABUADA COM FOR");
			System.out.println("3) EDITAR");
			System.out.println("4) EXCLUIR");
			System.out.println("9) SAIR");
			System.out.println("---------------");
			System.out.println("Informe a op??o desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("----TABUADA----");
				int valor;
				int multiplicador = 0;
				
				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + " x " + multiplicador +  " = " + (valor * multiplicador));
					multiplicador++;
				}while(multiplicador <=10);
				
				break;
			case 2:
				System.out.println("----TABUADA COM FOR----");
				int valor2;	
				
			System.out.println("Informe o valor: ");
			valor2 = tec.nextInt();
		
				for(int i = 0; i <= 10; i++) {
					System.out.println(valor2 + "x" + i + "=" + (valor2 * i));
				}
				break;
			case 3:
				System.out.println("----EDITAR----");
				break;
			case 4:
				System.out.println("EXCLUIR");
				break;
			case 9:
			    opcao = "n";
			    
			    break;
			default:
				System.out.println("Op??o iv?lida.");
				break;
			}
		
		}while(opcao.equalsIgnoreCase ("s"));
		
		System.out.println("Sistema finalizado.");
	}
}
