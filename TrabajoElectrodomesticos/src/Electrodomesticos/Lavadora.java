package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
 * Clase hija de padre Electrodomestico
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
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	/**
	 * Metodo precioFinal, llama a metodo padre y aumenta el precio si la carga es mayor a 80
	 */
	
	public double precioFinal() {
		double aumentoPeso = super.precioFinal();
		
		if (carga > 80) {
			aumentoPeso = aumentoPeso + 50;
		} 
		return aumentoPeso;
	}
}
