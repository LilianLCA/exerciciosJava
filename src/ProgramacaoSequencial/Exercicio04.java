package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		short a, b, c, d, r, s;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor positivo de A:");
		a= ler.nextShort();
		System.out.println("Entre com o valor positivo de B:");
		b= ler.nextShort();
		System.out.println("Entre com o valor positivo de C:");
		c= ler.nextShort();
		
		r = (short) ((a + b) * (a + b));
		s = (short) ((b + c) * (b + c));
		d = (short) ((r + s) / 2);
		System.out.println("O valor final é: " +d);

	}

}
