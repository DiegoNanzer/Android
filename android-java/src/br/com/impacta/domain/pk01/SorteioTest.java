package br.com.impacta.domain.pk01;

public class SorteioTest {
	
	public static void main(String[] args) {

		SorteioController sor = SorteioController.getInstance(6);

		for (int i = 0; i < 6; i++) {
			sor.Next();
		}

		Integer[] valores = sor.getResultado();

		for (Integer integer : valores) {
			System.out.println(integer);
		}

	}
}
