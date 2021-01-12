package br.com.java;

import java.util.Scanner;

public class Main {
	
	public short opExiste;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short op;
		double num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println(" Digite a opera��o desejada: ");
			System.out.println("1 : Soma");
			System.out.println("2 : Subtra��o");
			System.out.println("3 : Multiplica��o");
			System.out.println("4 : Divis�o");
			System.out.println("0 : Sair");
			System.out.print  ("op");
			
//			teclado.close();
			
			op = teclado.nextShort();
			
			if (op == 0) {
				System.exit(0); 
				//System.out.println("Por favor entre com um n�mero v�lido");
				break;
			}
			
			if (!opExiste(op)) {
				continue;
			}
			
			System.out.println("Digite o primeiro n�mero");
			num1 = teclado.nextDouble();
			
			System.out.println("Digite o segundo n�mero");
			num2 = teclado.nextDouble();
			
			if (!validaEntrada (op,num1,num2)) {
				continue;
			}
			
			System.out.println(" Resultado: O resultado da opera��o " + getNomeOperacao(op) + " eh " + Calcular (op, num1, num2 ) + " \n ");
		} while (op !=0);
		
	

	}
	static double Calcular(short op, double num1, double num2) {
		
		double resultado =0;
		
		switch (op) {
		case 1: //soma
			
			resultado = num1 + num2;
			break;
		case 2: //subtra��o
			
			resultado = num1 - num2;
			break;
		case 3: // multiplica��o
			
			resultado = num1 * num2;
			break;
		case 4: //divis�o
			
			resultado = num1 / num2;
			break;
		
		
			
		}
		
		return resultado;
	}
	static boolean opExiste(short op) {
		
		boolean retorno = true;
		
		if (op > 4) {
			System.out.println(" Erro: Opera��o eh inv�lida.\n ");
			retorno = false;
		}
		
		return retorno;
	}
	
	static String getNomeOperacao(short op) {
		
		switch (op) {
		case 1: 
			
			return "soma";
		case 2: 
			return "subtra��o";
		
		case 3: 
			return "multiplica��o";
		
		case 4: 
			return "divis�o";
			
	
		default:
			return "undefined";
			
		}
	}
	static boolean validaEntrada(short op, double num1, double num2) {
		boolean retorno =  true;
		
		if (op == 4 & num2 == 0 ) {
			System.out.println(" Erro: Divisor n�o pode ser zero.\n ");
			retorno = false;
		}
		
		return retorno;
	}

}
