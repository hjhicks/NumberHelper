import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculationTest {
	
	@Test
	void testCos() {	
		Calculation cal = new Calculation();
		String input = "cos(0";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("1"));
	}
	
	@Test
	void testTan() {
		Calculation cal = new Calculation();
		String input = "tan(0";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("0"));
	}
	
	@Test
	void testSin() {
		Calculation cal = new Calculation();
		String input = "sin(0";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("1"));
	}
	
	@Test
	void testLn() {
		Calculation cal = new Calculation();
		String input = "ln(0";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("1"));
	}
	
	@Test
	void testLog(){
		Calculation cal = new Calculation();
		String input = "log(0";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("1"));
	}
	
	@Test
	void testBaseCase() {
		Calculation cal = new Calculation();
		String input = "-3 + 1";
		cal.receive(input);
		assertTrue(cal.getAnswer().equals("2"));
	}
}
