package com.thiago.cursomc.domain.enums;

public enum EstadoPagamento {
	
		PENDENTE(1,"Pendente"),
		QUITADO(2,"Quitado"),
		CANCELADO(3,"Cance,ado");
	
	private int cod;
	private String descricao;
	
	//Construtor do tipo enumerado ele é sempre do tipo privado.
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null)
			return null;
		
		for(EstadoPagamento x: EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) 
				return x;
		}
		
		throw new IllegalArgumentException("Id inválido " + cod);
	}
}
