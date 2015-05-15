package br.com.impacta.android100h.controller;

public class SorteioController {

	private static SorteioController sorteio;

	private Integer[] listaInterna;

	private Integer qtdItens;
	private Integer auxPosicao;

	private SorteioController(Integer pQtd) {
		this.qtdItens = pQtd;
		this.listaInterna = new Integer[pQtd];
		this.auxPosicao = 0;
	}

	public static SorteioController getInstance(Integer pQtd) {
		if (sorteio == null)
			sorteio = new SorteioController(pQtd);

		return sorteio;
	}

	public void Next() {
		Integer aux = (int)(1 + Math.random() * 60);

		if (auxPosicao == (qtdItens)) {
			auxPosicao = 0;
		}

		if (!hasValue(aux)) {
			listaInterna[auxPosicao] = aux;
			auxPosicao++;
		} else {
			Next();
		}
	}

	private boolean hasValue(Integer pValue) {
		for (Integer i : listaInterna) {

			if (i == pValue) {
				return true;
			}
		}
		return false;
	}

	public CharSequence getResultado() {
		StringBuilder str = new StringBuilder();

		for (Integer i = 0; i < this.listaInterna.length; i++) {
			if (this.listaInterna[i] != null)
				str.append(String.format("%02d ", this.listaInterna[i]));
		}
		return str.toString();
	}

}
