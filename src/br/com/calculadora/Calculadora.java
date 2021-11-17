package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		scan.close(); 
		
 
		
		 int soma = soma(a, b);
		 int subtracao = subtracao(a, b);
		 int multiplicacao = multiplicacao(a, b);
		 int divisao = divisao(a, b);
		System.out.println("O valor da soma dos números é : " + soma);
		System.out.println("O valor da subtração dos números é : " + subtracao);
		System.out.println("O valor da multiplicação dos números é : " + multiplicacao);
		System.out.println("O valor da divisão dos números é : " + divisao);

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
