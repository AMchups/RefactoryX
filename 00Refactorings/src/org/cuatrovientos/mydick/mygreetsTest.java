package org.cuatrovientos.mydick;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for mygreets haha, you got it?
 * you're testing mygreets. It's brilliant
 */
public class mygreetsTest {

	@Test
	public void testGreetMethod() {
		mygreets mygreets = new mygreets();

		String expected = "hola";
		String target = mygreets.greets(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hello";
		target = mygreets.greets(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixo";
		target = mygreets.greets(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
