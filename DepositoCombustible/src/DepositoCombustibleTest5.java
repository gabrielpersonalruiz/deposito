import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest5 {

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.consumir(5.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(15.0,depNivel,0);
	}
	@Test
	public void testConsumir2() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		tank.consumir(-5.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(25.0,depNivel,0);
	}
	@Test
	public void testConsumir3() {
		DepositoCombustible tank = new DepositoCombustible(200.0,100.0);
		tank.consumir(97.0);
		double depNivel= tank.getDepositoNivel();
		assertEquals(3.0,depNivel,0);
	}
}
