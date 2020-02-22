package Electrodomesticos;

public class Electrodomestico {

	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	protected final String COLOR = "blanco";
	protected final char CONSUMO_ENERGETICO = 'F';
	protected final int PRECIO_BASE = 100000;
	protected final int PESO =5;
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico() {
		super();
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public char getCONSUMO_ENERGETICO() {
		return CONSUMO_ENERGETICO;
	}

	public int getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	public int getPESO() {
		return PESO;
	}
	
	/**
	 * @param consumoEnergetico
	 * comprueba el consumo energetico del electrodomestico
	 */
	public void comprobarConsumoEnergetico(char consumoEnergetico){
		if (consumoEnergetico>65 && consumoEnergetico<=70 ) {
			this.consumoEnergetico=consumoEnergetico;
		} else {
			this.consumoEnergetico=CONSUMO_ENERGETICO;
		}
	}
	
	public void comprobarColor(String color) {
		String colores[]= {"blanco", "negro", "rojo", "azul", "gris"};
		boolean positivo=false;
		
		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equals(color)) {
				positivo=true;
			}
		}
		
	}
	
	public static void precioFinal() {
		
	}
	
}
