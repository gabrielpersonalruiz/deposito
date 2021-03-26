import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest3 {

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertTrue(tank.estaVacio());
	}

}
