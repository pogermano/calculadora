package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		scan.close(); 
		
 
		
		System.out.println("O valor da soma dos n�meros � : " + soma(a, b));
		System.out.println("O valor da subtra��o dos n�meros � : " + subtracao(a, b));
		System.out.println("O valor da multiplica��o dos n�meros � : " + multiplicacao(a, b));
		System.out.println("O valor da divis�o dos n�meros � : " + divisao(a, b));

	}

	private static int divisao(int a, int b) {
		return a / b;
	}

	private static int multiplicacao(int a, int b) {
		return a * b;
	}

	private static int subtracao(int a, int b) {
		return a - b;
	}

	private static int soma(int a, int b) {
		return a + b;
	}

}
