package one.digitalinnovation.gof;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr - aprendiz: Josué Oliveira
 */

public class SingletonLazy {
	
private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
