package br.com.impacta.domain.poo;

public class AnimalTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println(String.format("%02d", 1));
		
		Animal[] animais = {
		 new Cao(), new Gato(),
				new Leao(), new Lobo() };

		for (Animal animal : animais) {
			animal.Comer(animal);
			
			if( animal instanceof Canino)
			{
				((Canino)animal).latir();			
			}
			else if( animal instanceof Felino)
			{
				((Felino)animal).ronronar();
			}
			
			if( animal instanceof Domestico)
			{
				((Domestico)animal).brincar();
			}
			
			animal.mover();
		}

	}
}
