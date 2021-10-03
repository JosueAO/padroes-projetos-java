package one.digitalinnovation.gof;

/**
 * Singleton "apressado".
 * 
 * @author falvojr - aprendiz: Josué Oliveira
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
