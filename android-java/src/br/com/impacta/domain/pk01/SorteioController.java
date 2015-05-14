package br.com.impacta.domain.pk01;

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
		Integer aux = (int) (Math.random() * 60);

		if (auxPosicao == (qtdItens)) {
			auxPosicao = 0;
		}
		
		if(!hasValue(aux))
		{
			listaInterna[auxPosicao] = aux;
			auxPosicao ++;
		}
		else
		{
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

	public Integer[] getResultado() {
		return this.listaInterna;
	}

}
