/**
 * 
 */
package Electrodomesticos;

/**
 * @author nicolasrobertoalarconalallana
 *
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
		listasElectro[2] = new Television(500, "azul", 'f', 10, 42, false);
		listasElectro[3] = new Lavadora();
		listasElectro[4] = new Lavadora(200, "rojo", 'c', 20, 10);
		listasElectro[5] = new Electrodomestico ();
		listasElectro[6] = new Lavadora(300, null, 'b', 10, 5);
		listasElectro[7] = new Television();
		listasElectro[8] = new Electrodomestico(80, "blanco", 'c', 30);
		listasElectro[9] = new Lavadora();
		
		double sumaElecrto = 0, sumaLavadora =0, sumaTelevision = 0;
		
		
		
		
		
	}

}
