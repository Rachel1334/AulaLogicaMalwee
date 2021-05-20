package br.com.senai;
import java.util.Scanner;

public class Exercicio2005 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoMenu;
		do {
			System.out.println("----MENU----");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("---------------");
			System.out.println("Informe a op��o desejada: ");
			opcaoMenu = tec.nextInt();
			
			switch(opcaoMenu) {
			case 1:
				System.out.println("Verificar sexo e idade");
				String nome;
				int anoDeNascimento;
				String sexo = "m";
				int idade;
				System.out.println("Informe o nome: ");
				nome = tec.next();



				System.out.println("Informe o ano de nascimento:");
				idade = 2021 - tec.nextInt();
				
				System.out.println("Informe se sexo [m/f]: ");
				sexo = tec.next();
				if (sexo.equals("m")) {
					System.out.println("Masculino");
				}
				
				if (!sexo.equals("m")) {
					System.out.println("Feminino");
				}
		
					if(idade <12) {
						System.out.println("Crian�a");
				
					}else if(idade < 18) {
						System.out.println("Jovem");
					
					}else if(idade < 65) {
						System.out.println("Adulto");
				
					} else {
						System.out.println("Idoso");
						}
					
					if(idade < 16) {
		                System.out.println("Voc� n�o pode votar");
					}
		            if(idade >= 16 ) {
		               System.out.println("seu voto � opcional");
					}else {
		                System.out.println("seu voto � obrigat�rio");
					 }
		            if(idade < 18) {
		                System.out.println("Voc� n�o pode tirar a habilita��o");
		            }else {
		               System.out.println("Voc� j� pode tirar a habilita��o");
		            }
		            System.out.println(nome);
		           break;
			case 2:			
				System.out.println("Contagem de valores");
				
				System.out.print("informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("informe o segundo valor: ");
				int segundoValor = tec.nextInt();
				
					if(primeiroValor  > segundoValor) {
						while(segundoValor <= primeiroValor) {
							segundoValor ++;
							System.out.println(segundoValor);
						}
					}else {
						while(primeiroValor <= segundoValor){	
							primeiroValor ++;
							System.out.println(primeiroValor);
						}
				}	
				break;
		
			case 3:
				System.out.println("Tabuada");
			
				int valor;
				int multiplicador = 0;
			
				System.out.println("Informe um valor: ");
				valor = tec.nextInt();
			
				do {
					System.out.println(valor + " x " + multiplicador +  " = " + (valor * multiplicador));
					multiplicador++;
				}while(multiplicador <=10);
					
				break;
			case 4:
				System.out.println("Cadastrar cursos");
				int curso;
				
				String addNovo = "s";
				do {
				System.out.print("informe um curso: ");
				curso = tec.nextInt();
				
				System.out.println("Deseja informar uma nova idade? [s/n]: ");
				addNovo = tec.next();
			}while(addNovo.equals("s"));
				break;
				
			default:
				System.out.println("Op��o iv�lida.");
				break;
			}
		}while(opcao.equalsIgnoreCase ("s"));
		
		System.out.println("Sistema finalizado.");
	}		
		
}	


