import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest4 {

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double depNivel= tank.getDepositoNivel();
		double depMax = tank.getDepositoMax();
		assertEquals(depNivel,depMax/2,0);
	}
	
}
