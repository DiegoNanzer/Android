package br.com.impacta.domain.pk01;

import javax.swing.JOptionPane;

public class Carro {

	// Estado ( atributo ou propriedades )
	private final String _carroLigando = "Carro ligado";
	private final String _carroMovimento = "Carro em movimento...";
	private final String _carroParado = "Carro parado";

	// Construtor ( É um comportamento )

	// Comportamento ( método )

	public String ligar() {
		return this._carroLigando;
	}

	public String guiar() {
		return this._carroMovimento;
	}

	public String parar() {
		return this._carroParado;
	}

}
