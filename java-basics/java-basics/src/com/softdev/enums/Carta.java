package com.softdev.enums;

public class Carta {
	
	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
		
	}
	
	public void imprimirCarta() {
		System.out.println("Sou a carta "+numero+" de naipe "+naipe+" . E tenho a cor "
	+naipe.getCor()+" com tonalidade "+naipe.getTonalidade()+". Fui feita com papel "+
				naipe.getPapel()+".");
	}

}
