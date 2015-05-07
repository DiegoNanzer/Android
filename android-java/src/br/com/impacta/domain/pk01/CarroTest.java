package br.com.impacta.domain.pk01;

public class CarroTest {

	/**
	 * @param args
	 * 
	 **/
	public static void main(String[] args) {
		
		System.out.println("Iniciando teste...");
		
		Carro c = new Carro();
		
		c.ligar();
		c.guiar();
		c.guiar();
		c.parar();
		
				
		System.out.println("Teste finalizado");
		
		c = null;

	}

}
