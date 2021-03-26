import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {


	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,2.0);
	double depNivel = tank.getDepositoNivel();
		assertEquals(2.0, depNivel, 0);
	}

}
