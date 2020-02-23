package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
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
	/**
	 * 
	 */
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Television(int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
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
	
	/*public static void precioFinal(){
		
	}*/
	
	
	
	
		
	
	
}
