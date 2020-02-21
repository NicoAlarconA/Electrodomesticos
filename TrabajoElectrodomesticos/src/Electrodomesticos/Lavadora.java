package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
 *
 */
/**
 * @author nicolasrobertoalarconalallana
 *
 */
public class Lavadora extends Electrodomestico {

	
	int carga;
	
	private final int CARGA = 5;

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public Lavadora() {
		
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		
	}

	public int getCarga() {
		return carga;
	}

	public int getCARGA() {
		return CARGA;
	}
	
	public static void precioFInal() {
		
	}
	
	
}
