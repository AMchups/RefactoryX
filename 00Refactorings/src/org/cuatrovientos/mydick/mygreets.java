package org.cuatrovientos.mydick;
/**
 * 
 */

/**
 * @author Bad Taste
 * greets in different languages
 */
public class mygreets {

	/**
	 * Greets 
	 * @param languaje chosen language
	 * @param repeats how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greets (int languaje, int repeats) {
		String greeting = "";
		String person = "";
		
		switch (languaje) {
			case 0 : person = "hola";
					 break;
			case 1 : person = "hello";
					 break;
			case 2 : person = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<repeats;i++) {
			greeting += person;
		}
		
		return greeting;
	}
}
