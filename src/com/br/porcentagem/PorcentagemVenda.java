package com.br.porcentagem;
import java.util.Scanner;

public class PorcentagemVenda {
	public static void main(String[] args) {
		String id = "";
		String peca = "";
		double valor = 0;
		int quant = 0;
		double comissao = 0;
		double total = 0;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("informe o nome do vendedor");
		
		id = s.next();
		
		System.out.println("informe o produto vendido");
		
		peca = s.next();
		
		System.out.println("informe valor da peça");
		
		valor = s.nextDouble();
		
		System.out.println("informe a quantidade vendida");

		quant = s.nextInt();
		
		total = valor * quant;
		
		comissao = (total * 5)/100;
		
		System.out.println("total vendido pelo " + id +": " + total);
		System.out.println("total de comissão a receber:" + comissao);
		
		
	}

}
