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
	
	/**
	 * @param color
	 * comprueba el color del electrodomestico
	 */
	public void comprobarColor(String color) {
		String colores[]= {"blanco", "negro", "rojo", "azul", "gris"};
		boolean positivo=false;
		
		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equals(color)) {
				positivo=true;
			}
		}
		
	}
	
	public double precioFinal() {
		double aumentoPeso = 0;
			
		if (peso >= 0 && peso <= 19){
			aumentoPeso = aumentoPeso + 10;
		}else if (peso >= 20 && peso <= 49){
				aumentoPeso = aumentoPeso + 50;
			}else if (peso >= 50 && peso <= 79){
						aumentoPeso = aumentoPeso+ 80;
					}else if (peso > 80){
							aumentoPeso = aumentoPeso + 100;
		}
		
		switch (consumoEnergetico) {
		case 'a':
			aumentoPeso = aumentoPeso + 100;
			break;
		case 'b':
			aumentoPeso = aumentoPeso + 80;
			break;
		case 'c':
			aumentoPeso = aumentoPeso + 60;
			break;
		case 'd':
			aumentoPeso = aumentoPeso + 50;
			break;
		case 'e':
			aumentoPeso = aumentoPeso + 30;
			break;
		case 'f':
			aumentoPeso = aumentoPeso + 10;
			break;
		}
		return aumentoPeso + precioBase;
		}
	
	
}
