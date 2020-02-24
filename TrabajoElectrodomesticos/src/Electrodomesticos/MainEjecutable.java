/**
 * 
 */
package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
 *clase que ejecuta las ordenes
 */
public class MainEjecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico listasElectro[] = new Electrodomestico[10];
		listasElectro[0] = new Electrodomestico(200, "verde", 'a', 20);
		listasElectro[1] = new Electrodomestico(100, "rojo", 'c', 50);
		listasElectro[2] = new Television(500, "azul", 'f', 10, 42, true);
		listasElectro[3] = new Lavadora();
		listasElectro[4] = new Lavadora(200, "rojo", 'c', 20, 10);
		listasElectro[5] = new Electrodomestico ();
		listasElectro[6] = new Lavadora(300, null, 'b', 10, 5);
		listasElectro[7] = new Television();
		listasElectro[8] = new Electrodomestico(80, "blanco", 'c', 30);
		listasElectro[9] = new Lavadora();
		
		double sumaElectro = 0, sumaLavadora =0, sumaTelevision = 0;
		 
		
		for (int i = 0; i < listasElectro.length; i++) {
			
			if(listasElectro[i] instanceof Electrodomestico) {
				sumaElectro = sumaElectro + listasElectro[i].precioFinal();
			} 	
			if(listasElectro[i] instanceof Lavadora) {
				sumaLavadora = sumaLavadora + listasElectro[i].precioFinal();
			}
			if(listasElectro[i] instanceof Television) {
				sumaTelevision = sumaTelevision + listasElectro[i].precioFinal();
			}
		}
		
		System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectro);
	    System.out.println("La suma del precio de las lavadoras es de "+sumaLavadora);
	    System.out.println("La suma del precio de las televisiones es de "+sumaTelevision);
	} 
}
