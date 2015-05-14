package br.com.impacta.domain.poo;

public class Gato extends Felino implements Domestico{

	@Override
	public void Comer(Object o) {
		System.out.println("Gato comendo");
		
	}

	@Override
	public void ronronar() {
		System.out.println("Gato ronronando...");
		
	}

	@Override
	public void brincar() {
		System.out.println("Gato brincando...");
	}

}
