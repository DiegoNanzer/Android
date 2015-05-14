package br.com.impacta.android100h.controller;

import br.com.impacta.android100h.domain.model.Gorjeta;

public class GorjetaController {

	public Gorjeta CalcularGorjeta(double pValorConta, double pGorjeta)
	{
		Gorjeta gor = new Gorjeta();
		
		gor.setValorConta(pValorConta);
		
		gor.setValorGorjeta( pValorConta * (pGorjeta/100));
		
		gor.setValorTotal(gor.getValorConta() + gor.getValorGorjeta());
		
		return gor;		
	}
}
