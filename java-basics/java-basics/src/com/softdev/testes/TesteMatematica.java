package com.softdev.testes;

import com.calculos.MatematicaUtil;

public class TesteMatematica {
	//esta classe est� dentro de src/default package

	public static void main(String[] args) {
		int numeroFibonacci =  MatematicaUtil.calcularFibonacci(8);
		System.out.println("N�mero Fibonacci na posi��o 8 vale: "+numeroFibonacci);
		
		double raio = 104.8d;
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(raio);
		System.out.println("�rea do C�rculo de raio "+raio+ " vale: "+ areaCirculo);
		

	}

}
