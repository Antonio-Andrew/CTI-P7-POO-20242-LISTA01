package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double preco_fabrica, percentual_distribuidora, percentual_imposto, valor_distribuidora, 
		valor_imposto, preco_final;
		preco_fabrica = 1200;
		percentual_distribuidora = 0.5;
		percentual_imposto = 0.02;
		valor_distribuidora = preco_fabrica * percentual_distribuidora;
		valor_imposto = preco_fabrica * percentual_imposto;
		preco_final = preco_fabrica + valor_distribuidora + valor_imposto;
		System.out.println(valor_distribuidora);
		System.out.println(valor_imposto);
		System.out.println(preco_final);
		
	}

}
