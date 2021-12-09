package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		float a, b, c, d, i, f, x, y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor de A:");
		a= ler.nextFloat();
		System.out.println("Entre com o valor de B:");
		b= ler.nextFloat();
		System.out.println("Entre com o valor de C:");
		c= ler.nextFloat();
		System.out.println("Entre com o valor de D:");
		d= ler.nextFloat();
		System.out.println("Entre com o valor de I:");
		i= ler.nextFloat();
		System.out.println("Entre com o valor de F:");
		f= ler.nextFloat();

		x = (c * i) - (b * f) / (a * i) - (b * d);
		y = (a * f) - (c * d) / (a * i) - (b * d);
		System.out.println("O valor de x é:" + x + " e o valor de y é:" + y);	
	}

}
