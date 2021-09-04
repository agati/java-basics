package com.softdev.enums;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		
		OperacaoAritmetica op1 = OperacaoAritmetica.ADICAO;
		double resultado1 = op1.operacao(5,3);
		System.out.println("O resultado é: " + resultado1);
		
		OperacaoAritmetica op2 = OperacaoAritmetica.SUBTRACAO;
		double resultado2 = op2.operacao(5,3);
		System.out.println("O resultado é: " + resultado2);
		
		OperacaoAritmetica op3 = OperacaoAritmetica.MULTIPLICACAO;
		double resultado3 = op3.operacao(5,3);
		System.out.println("O resultado é: " + resultado3);
		
		OperacaoAritmetica op4 = OperacaoAritmetica.DIVISAO;
		double resultado4 = op4.operacao(5,0);
		System.out.println("O resultado é: " + resultado4);
		System.out.println("-----------------------------------------");
		
		//repetindo as operações usando o for no enum OperacoesAritmeticas
		for(OperacaoAritmetica oa: OperacaoAritmetica.values()) {
			
			System.out.println(oa + " -> " + oa.operacao(5,3) );
			
		}

	}

}
