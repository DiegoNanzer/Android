package br.com.impacta.domain.poo;

public class Lobo extends Canino{

	@Override
	public void Comer(Object o) {
		System.out.println("Lobo comendo");
		
	}

	@Override
	public void latir() {
		System.out.println("Lobo latindo...");
	}

}
