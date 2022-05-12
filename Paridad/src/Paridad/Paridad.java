package Paridad;

public class Paridad {
	
	public static String parImpar(String cadena) {
		String cad = "";
		try {
			int n = Integer.parseInt(cadena);
			
			if (n % 2 == 0) {
				cad = "Par"; 
			} 
			else {
				cad = "Impar";
			}
			
		} catch (NumberFormatException nfe) { 
			cad = "Es una cadena!"; }
		
		return cad;
	}
}
