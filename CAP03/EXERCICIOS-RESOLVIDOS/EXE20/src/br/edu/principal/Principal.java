package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double angulo, altura, escada, radiano;
		angulo = 45;
		altura = 10;
		radiano = angulo * 3.14 / 190;
		escada = altura / Math.sin(radiano);
		System.out.println(escada);
	}

}
