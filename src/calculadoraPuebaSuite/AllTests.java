package calculadoraPuebaSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import calculadora2.CalculadoraParametroTest;
import calculadora2.CalculadoraTest;



/**
 * se ejecutan todas las pruebas (de cada clase) en conjunto
 * @author fjuribe
 *
 */
@RunWith(value=Suite.class)
@Suite.SuiteClasses({
	CalculadoraParametroTest.class,
	CalculadoraTest.class
})

public class AllTests{
	
}


