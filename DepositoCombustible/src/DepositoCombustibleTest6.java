import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest6 {

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.fill(10.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(30.0,depNivel,0);
	}
	@Test
	public void testFill2() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.fill(-15.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(5.0,depNivel,0);
	}
	@Test
	public void testFill3() {
		DepositoCombustible tank = new DepositoCombustible(200.0,20.0);
		tank.fill(170.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(190.0,depNivel,0);
	}	
}
