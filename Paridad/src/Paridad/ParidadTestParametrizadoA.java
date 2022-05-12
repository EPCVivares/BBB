package Paridad;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ParidadTestParametrizadoA {

	String numero,resultadoEsperado;
	
	
	public ParidadTestParametrizadoA(String numero, String resultadoEsperado) {
		this.numero = numero;
		this.resultadoEsperado = resultadoEsperado;
	}


	@Test
	public void test() {
		String resultadoActual = Paridad.parImpar(numero);
		
		assertEquals(resultadoEsperado,resultadoActual);
	}
	
	@Parameterized.Parameters
	public static Iterable<Object[]> getData() {
		
		ArrayList<Object[]> datos = new ArrayList<Object[]>();
		
		//Test 0
		datos.add(new String[] {"20","Par"});
		
		//Test 1
		datos.add(new String[] {"45","Impar"});
		
		//Test 2
		datos.add(new String[] {"Hola","Es una cadena!"});
		
		return datos;
	}

}

