package calculadora2;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

	
	@Parameters
	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{3,1,4},{2,3,5},{3,3,6}

//		List<Object[]> obj=new ArrayList<>();
//		obj.add(new Object[] {3,1,4});
//		obj.add(new Object[] {2,3,5});
//		obj.add(new Object[] {3,3,5});
//		return obj;
	
	});
	}
	private int a,b,exp;

	/****************Pruebas parametrizadas****************/
	 public CalculadoraParametroTest(int a,int b,int exp) {
		this.a=a;
		this.b=b;
		this.exp=exp;
	}

	@Test
	public void testAdd() {
		calculadora2.Calculadora calc= new calculadora2.Calculadora();
		int result=calc.add(a, b);
		assertEquals(exp, result);
	}

}
