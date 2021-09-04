package com.calculos;

public class MatematicaUtil {
	//esta classe est� dentro do diret�rio src
	
	final static double PI=3.14d;

	// http://pt.wikipedia.org/wiki/N�mero_de_Fibonacci
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}

	
		public static double calcularAreaCirculo(double d){
			return PI*d*d;
			
		}
	
}
