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
		
		JOptionPane.showMessageDialog(null,  c.ligar());
		JOptionPane.showMessageDialog(null,  c.guiar());
		JOptionPane.showMessageDialog(null,  c.guiar());
		JOptionPane.showMessageDialog(null,  c.parar());
						
		System.out.println("Teste finalizado");
		
		c = null;

	}

}
