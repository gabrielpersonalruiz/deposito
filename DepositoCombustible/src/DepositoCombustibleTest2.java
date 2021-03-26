import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest2 {

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,2.0);
	double depMax = tank.getDepositoNivel();
		assertEquals(2.0, depMax, 0);
	}

}
