package calculadora2;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculadoraTest {
  
   static Calculadora calc;
   
   /**
    * @BeforeClass se ejecuta al principio de la prueba (eje:inicializar recursos etc)
    */
   @BeforeClass
   public static void beforeClass() {
	   System.out.println("beforeClass()");
	   calc= new Calculadora();
   }
   
   
   /**
    * @before se ejecuta antes que se ejecute una prueba como tal
    */
  @Before
	public void Before() {
		System.out.println("before()");
		calc.clear();
	}
	
  
  /**
   * @After se ejecuta despues que se haya ejecutado la prueba
   */
  @After
  public  void After() {
	  System.out.println("after()");;
  }
  
  
  /**
   * @AfterClass se ejecuta al final de la prueba (Ej: para liempiar recursos etc)
   */
  @AfterClass
  public static void AfterClass() {
	  System.out.println("AfterClass()");
	  
  }
	
	@Test
	public void testSum() {
		System.out.println("testSum()");
		calc=new Calculadora();		
		int result =calc.add(3,2);
		int esper=5;
		assertEquals(esper, result);
	}
	
	
	@Test
	public void testAnsSum() {
		System.out.println("testAnsSum()");
		calc=new Calculadora();
		calc.add(3,2);
		int result=calc.ans();
		int esper=5;
		assertEquals(esper,result);
	}
	

	@Test
	public void testDiv() {
		calc.div(5,0);
	}
	
	
	/**
	 * expected tira una excepcion que se espera y maraca que la prueba es correcta
	 */
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("div() Exception");
		calc.div(5, 0);
	}
	
	/**
	 * hace que un metodo falle si se demora mas tiempo de lo normal
	 */
//	@Test(timeout = 100)
//	public void testalgoritmoOptimo() {
//		calc.operacionOptima();
//	}
	

}
