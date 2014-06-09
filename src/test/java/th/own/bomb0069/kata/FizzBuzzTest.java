package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = FizzBuzzFactory.create();
	
	@Test
	public void testDefaultRule () {
		assertEquals("1", fizzBuzz.say(1));
		assertEquals("2", fizzBuzz.say(2));
	}

	@Test
	public void testFizzRule () {
		assertEquals("Fizz", fizzBuzz.say(3));
		assertEquals("Fizz", fizzBuzz.say(6));
		assertEquals("Fizz", fizzBuzz.say(9));
	}

	@Test
	public void testBuzzRule () {
		assertEquals("Buzz", fizzBuzz.say(5));
		assertEquals("Buzz", fizzBuzz.say(10));
		assertEquals("Buzz", fizzBuzz.say(20));
	}
}