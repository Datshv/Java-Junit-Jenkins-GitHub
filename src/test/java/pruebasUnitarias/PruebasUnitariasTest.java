package pruebasUnitarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.calculadora.Adicion;
import org.calculadora.Division;
import org.calculadora.Extraccion;
import org.calculadora.Multiplicacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PruebasUnitariasTest {
	
	@BeforeClass
	public static void antesDeTodasLasPruebas() {
		System.out.println("El tag  @BeforeClass se usa para ejecutar codigo ANTES de que se ejecuente todos los @Test \n");
	}

	@Before
	public void antesDeCadaPrueba() {
		System.out.println("El tag  @Before se usa para ejecutar codigo ANTES de ejecutra cada @Test");
	}
	
	
	/**
	 * En esta clase Junit de pruebas unitarias se realizan las pruebas sobre los metodos 
	 * verificando que obtengamos los resultados esperados
	 */

	@Test
	public void adicionTest() {
		System.out.println("prueba adicion");
	   Adicion adicion = new Adicion();
	   assertNotEquals(3,adicion.suma(1, 2));
	}
	
	
	
	@Test
	public void extraccionTest() {
		System.out.println("prueba extraccion");
	   Extraccion extraccion = new Extraccion();
	   assertEquals(0,extraccion.resta(2, 2));
	}
	
	/**
	 * Se ignora el test multiplicacion con objetivo de practica para conocer el funcionamiento del tag @ignore
	 */
	@Ignore
	@Test
	public void multiplicacionTest() {
		System.out.println("prueba multiplicacion");
	   Multiplicacion multiplicacion = new Multiplicacion();
	   assertEquals(4,multiplicacion.multiplicacion(2, 2));
	}
	
	
	@Test
	public void divisionTest() {
		System.out.println("prueba division");
	   Division division = new Division();
	   assertEquals(2,division.division(4, 2));
	   assertEquals(0,division.division(1, 0));
	}

	
	
	
	@After
	public void despuesDeCadaPrueba() {
		System.out.println("El tag  @After se usa para ejecutar codigo DESPUES de ejecutar cada  @Test \n");
	}

	
	@AfterClass
	public static void despuesDeTodasLasPruebas() {
		System.out.println("\nEl tag  @AfterClass se usa para ejecutar codigo Despues de que se ejecuente todos los @Test");
	}
}
