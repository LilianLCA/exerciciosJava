package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		short resposta;
		short anos, meses, dias, sobra;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o total de dias:");
		resposta = ler.nextShort();
		
		anos= (short) (resposta/365);
		sobra= (short) (resposta%365);
		meses= (short) (sobra/30);
		dias= (short) (sobra%30);
		System.out.println("A idade expressa de uma pessoa é: " + anos + "anos" + meses + "meses e" + dias + "dias");
	}

}
