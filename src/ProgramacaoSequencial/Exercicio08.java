package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/* Ol� Mundo !!!*/
		
		float cf, dist, imp, cc;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o valor de F�brica do ve�culo:");
		cf= ler.nextFloat();
		
		dist = (float) (cf*0.28);
		imp = (float) (cf*0.45);
		cc = cf+dist+imp;
		System.out.println("O valor de venda do ve�culo �: "+ cc);

	}

}
