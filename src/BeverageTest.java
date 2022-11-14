import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Espresso();
		b1 = new Soy(b1);
		b1 = new SteamedMilk(b1);
		assertEquals("Espresso,Soy,SteamedMilk", b1.getDescription());
		System.out.println(b1.getDescription());
		assertEquals(2.24, b1.cost());

	}

}
