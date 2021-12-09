package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		short anos, meses, dias, res;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com os anos:");
		anos = ler.nextShort();
		System.out.println("Entre com os meses:");
		meses = ler.nextShort();
		System.out.println("Entre com os dias:");
		dias = ler.nextShort();
		res = (short) ((anos*365)+(meses*30)+dias);
		System.out.println("A idade da pessoa expressa em dias é:"+res);
				
	}

}
