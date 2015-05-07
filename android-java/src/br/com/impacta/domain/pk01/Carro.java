package br.com.impacta.domain.pk01;

import javax.swing.JOptionPane;

public class Carro {

	// Estado ( atributo ou propriedades )

	// Construtor ( É um comportamento )

	// Comportamento ( método )

	public void ligar() {

		System.out.println("Carro ligado");
		JOptionPane.showMessageDialog(null, "Carro ligando...");
	}

	public void guiar() {

		System.out.println("Carro em movimento...");
		JOptionPane.showMessageDialog(null, "Carro em movimento...");
	}

	public void parar() {

		System.out.println("Carro parado!");
		JOptionPane.showMessageDialog(null, "Carro parado!");
	}

}
