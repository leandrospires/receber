package com.example.receber.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceberJson {

	@JsonProperty("cod")
	private int cod;
	
	@JsonProperty("dados")
	private String dados;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}


	
	
}
