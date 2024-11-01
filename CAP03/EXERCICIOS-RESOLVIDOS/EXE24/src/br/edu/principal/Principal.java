package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double hora, m, conversao;
		int h;
		hora = 12.30;
		h = (int) (hora);
		m = hora - h;
		conversao = (h * 60) + (m * 100);
		System.out.println(conversao);
	}

}
