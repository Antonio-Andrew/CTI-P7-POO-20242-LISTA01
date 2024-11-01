package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double horas_trabalhadas, valor_salario_minimo, valor_hora_trabalhada,
		 valor_salario_bruto, imposto, valor_salario_liquido;
		horas_trabalhadas = 120;
		valor_salario_minimo = 1400;
		valor_hora_trabalhada = valor_salario_minimo / 2;
		valor_salario_bruto = valor_hora_trabalhada * horas_trabalhadas;
		imposto = valor_salario_bruto * 3/100;
		valor_salario_liquido = valor_salario_bruto - imposto;
		System.out.println(valor_salario_liquido);
	}

}
