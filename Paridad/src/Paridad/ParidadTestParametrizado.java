package Paridad;


@RunWith(value = Parameterized.class)
public class ParidadTestParametrizado {

	String numero,resultadoEsperado;
	
	
	public ParidadTestParametrizado(String numero, String resultadoEsperado) {
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
