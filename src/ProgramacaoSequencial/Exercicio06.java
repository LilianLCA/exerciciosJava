package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		float x1, y1, x2, y2, d;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor de X1:");
		x1= ler.nextFloat();
		System.out.println("Entre com o valor de Y1:");
		y1= ler.nextFloat();
		System.out.println("Entre com o valor de X2:");
		x2= ler.nextFloat();
		System.out.println("Entre com o valor de Y2:");
		y2= ler.nextFloat();
		
		d = (float) (Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2)));
		System.out.println("A distância entre os dois pontos é:"+ d);

	}

}
