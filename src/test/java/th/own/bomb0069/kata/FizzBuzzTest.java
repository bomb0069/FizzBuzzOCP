package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = FizzBuzzFactory.create();
	
	@Test
	public void test1ShouldbeReturn1 () {
		assertEquals("1", fizzBuzz.say(1));
	}

	@Test
	public void test2ShouldbeReturn2 () {
		assertEquals("2", fizzBuzz.say(2));
	}

	@Test
	public void test3ShouldbeReturnFizz () {
		assertEquals("Fizz", fizzBuzz.say(3));
	}
}