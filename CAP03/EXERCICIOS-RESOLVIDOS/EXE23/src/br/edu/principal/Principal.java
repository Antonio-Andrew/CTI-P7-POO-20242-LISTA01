package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double numero, fracao, arredondamento;
		int inteiro;
		numero = 3.14;
		inteiro = (int) (numero);
		fracao = numero - inteiro;
		arredondamento = Math.ceil(numero);
		System.out.println(inteiro);
		System.out.println(fracao);
		System.out.println(arredondamento);
	}

}
