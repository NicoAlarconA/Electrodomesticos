package Electrodomesticos;

public class Electrodomestico {

	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	private final String COLOR = "blanco";
	private final char CONSUMO_ENERGETICO = 'F';
	private final int PRECIO_BASE = 100000;
	private final int PESO =5;
	
	public enum color {
		
		blanco, negro, rojo, azul ,gris
	
	}

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
	
	public static void comprobarConsumoEnergetico(){
		
	}
	
	public static void comprobarColor() {
		
	}
	
	public static void precioFinal() {
		
	}
	
}
