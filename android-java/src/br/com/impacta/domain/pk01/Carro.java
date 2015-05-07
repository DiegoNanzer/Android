package br.com.impacta.domain.pk01;

public class Carro {

	// Estado ( atributo ou propriedades )
	private final String _carroLigando = "Carro ligado";
	private final String _carroMovimento = "Carro em movimento...";
	private final String _carroParado = "Carro parado";

	private String menssagem;

	// Construtor ( É um comportamento )

	// Comportamento ( método )

	public void ligar() {
		menssagem = this._carroLigando;
	}

	public void guiar() {
		menssagem = this._carroMovimento;
	}

	public void parar() {
		menssagem = this._carroParado;
	}

	@Override
	public String toString() {
		return this.menssagem;
	}
	

}
