package br.com.impacta.domain.poo;

public class Cao extends Canino implements Domestico {

	@Override
	public void Comer(Object o) {
		System.out.println("Cao comendo");
	}

	@Override
	public void latir() {
		System.out.println("Cao latindo");
	}

	@Override
	public void brincar() {
		System.out.println("Cão brincando");
	}
}
