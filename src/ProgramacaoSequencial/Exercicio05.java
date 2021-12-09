package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		float n1, n2, n3, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a média N1:");
		n1= ler.nextFloat();
		System.out.println("Entre com a média N2:");
		n2= ler.nextFloat();
		System.out.println("Entre com a média N3:");
		n3= ler.nextFloat();
		
		n1 = n1 * 2;
		n2 = n2 * 3;
		n3 = n3 * 5;
		media = (n1 + n2 + n3) / 10;
		System.out.println("A média final do aluno é:"+ media);	
		
	}

}
