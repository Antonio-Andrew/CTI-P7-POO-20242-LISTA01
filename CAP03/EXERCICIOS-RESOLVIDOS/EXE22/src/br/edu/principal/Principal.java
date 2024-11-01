package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double valor_salario, quantidade_quilowatts, valor_quilowatts, valor_reais, desconto,
		valor_desconto;
		valor_salario = 1200;
		quantidade_quilowatts = 10;
		valor_quilowatts = valor_salario / 5;
		valor_reais = valor_quilowatts * quantidade_quilowatts;
		desconto = valor_reais * 15/100;
		valor_desconto = valor_reais - desconto;
		System.out.println(valor_quilowatts);
		System.out.println(valor_reais);
		System.out.println(valor_desconto);
		
	}

}
