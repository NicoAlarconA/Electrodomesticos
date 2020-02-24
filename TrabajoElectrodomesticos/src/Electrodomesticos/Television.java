package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
 * Clase hija de padre Electrodomestico, contiene atributos y metodo de aumento de precio
 * 
 */
 
public class Television extends Electrodomestico {

	int resolucion;
	boolean sintonizadorTDT;
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADORTDT= false;
	/**
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public Television() {
		super();
	}
	
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
	}
		
	public int getResolucion1() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public int getResolucion() {
		return RESOLUCION;
	}
	public boolean isSintonizadortdt() {
		return SINTONIZADORTDT;
	}
	/**
	 * Metodo precio final, llama a metodo padre y aumenta el precio si la television tiene Sintonizador 
	 * y si la resolucion es mayo a 40
	 */
	public double precioFinal(){
		double aumentoPeso = super.precioFinal();
		
		if (this.resolucion > 40) {
			aumentoPeso = aumentoPeso + precioBase *0.3;
				if (this.sintonizadorTDT = true) {
					aumentoPeso = aumentoPeso + 50;
				}
		}
		return aumentoPeso;
	}
}
