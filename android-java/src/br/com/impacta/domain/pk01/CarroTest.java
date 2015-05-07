package br.com.impacta.domain.pk01;

import javax.swing.JOptionPane;

public class CarroTest {

	/**
	 * @param args
	 * 
	 **/
	public static void main(String[] args) {

		System.out.println("Iniciando teste...");

		Carro c = new Carro();

		c.ligar();
		showMessage(c);
		c.guiar();
		showMessage(c);
		c.guiar();
		showMessage(c);
		c.parar();
		showMessage(c);
		System.out.println("Teste finalizado");

		c = null;

	}

	private static void showMessage(Carro pMessage) {
		JOptionPane.showMessageDialog(null, pMessage);

	}

}
