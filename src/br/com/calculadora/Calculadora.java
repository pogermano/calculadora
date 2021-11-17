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

		soma(a, b);
		subtracao(a, b);
		multiplicacao(a, b);
		divisao(a, b);
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
