package com.softdev.testes;

import com.calculos.MatematicaUtil;

public class TesteMatematica {
	//esta classe está dentro de src/default package

	public static void main(String[] args) {
		int numeroFibonacci =  MatematicaUtil.calcularFibonacci(8);
		System.out.println("Número Fibonacci na posição 8 vale: "+numeroFibonacci);
		
		double raio = 104.8d;
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(raio);
		System.out.println("Área do Círculo de raio "+raio+ " vale: "+ areaCirculo);
		

	}

}
