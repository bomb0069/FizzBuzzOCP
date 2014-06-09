package th.own.bomb0069.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	
	@Test
	public void test1ShouldbeReturn1 () {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("1", fizzBuzz.say(1));
	}

	@Test
	public void test2ShouldbeReturn2 () {
		FizzBuzz fizzBuzz = FizzBuzzFactory.create();
		assertEquals("2", fizzBuzz.say(2));
	}
}