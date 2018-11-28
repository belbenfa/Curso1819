package pruebas;

public class Baraja {

	private final int numPalos = 4;
	private final int numCartasPalo = 12;
	private final int numCartas = numPalos * numCartasPalo;

	private Carta[][] cartas;

	public Baraja() throws Exception {
		cartas = new Carta[numPalos][numCartasPalo];

		for (int palo = 0; palo < numPalos; palo++) {
			for (int valor = 0; valor < numCartasPalo; valor++) {
				cartas[palo][valor] = new Carta(palo + 1, valor + 1);
			}
		}
	}

	public void echarCartas() {
		for (int palo = 0; palo < numPalos; palo++) {
			for (int valor = 0; valor < numCartasPalo; valor++) {
				System.out.print(cartas[palo][valor].toString());
			}
			System.out.println();;
		}
	}

}
