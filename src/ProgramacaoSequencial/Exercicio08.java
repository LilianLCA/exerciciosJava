package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/* Olá Mundo !!!*/
		
		float cf, dist, imp, cc;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor de Fábrica do veículo:");
		cf= ler.nextFloat();
		
		dist = (float) (cf*0.28);
		imp = (float) (cf*0.45);
		cc = cf+dist+imp;
		System.out.println("O valor de venda do veículo é: "+ cc);

	}

}
