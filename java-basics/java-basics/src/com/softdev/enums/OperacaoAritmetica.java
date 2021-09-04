package com.softdev.enums;

public enum OperacaoAritmetica {
	
	ADICAO{
		public double operacao(double x, double y) {
			return (double)(x+y);
		}
	},
	SUBTRACAO{
		public double operacao(double x, double y) {
			return (x-y);
		}
	},
	MULTIPLICACAO{
		public double operacao(double x, double y) {
			return (x*y);
		}
		
	},	
		

	DIVISAO{
		public double operacao(double x, double y) {
			//TODO: tratar a divisão por zero
			return (x/y);
			}
		};
	
	
	public abstract double operacao(double x, double y);
	
}
	


