package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		short  ev, h, m, s, r;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tempo de duração em segundos:");
		ev = ler.nextShort();
		
		h= (short) (ev/3600);
		r= (short) (ev%3600);
		m= (short) (r/60);
		s= (short) (r%60);
		System.out.println("O tempo de duração é: " +h+ " horas" +m+ "minutos e" +s+ "segundos");

	}

}
