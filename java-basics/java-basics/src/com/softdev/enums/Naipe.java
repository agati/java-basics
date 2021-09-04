package com.softdev.enums;

public enum Naipe {
	
	OURO("Vermelha","Escura", "Couche"),
	PAUS("Preta", "Clara", "Sulfite"),
	ESPADA("Preta", "Desbotada","Canvas"),
	COPAS("Vermelha","Envelhecida","Couche");
	
	Naipe(String cor, String tonalidade, String papel){
		this.cor = cor;
		this.tonalidade=tonalidade;
		this.papel=papel;
		
	}
	
	private String cor;
	private String tonalidade;
	private String papel;
	
	public String getCor() {
		return cor;
	}

	public String getTonalidade() {
		return tonalidade;
	}
	
	public String getPapel() {
		return papel;
	}
}
