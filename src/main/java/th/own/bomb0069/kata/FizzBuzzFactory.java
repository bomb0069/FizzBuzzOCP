package th.own.bomb0069.kata;

import java.util.List;
import java.util.Arrays;

public class FizzBuzzFactory {
	
	public static FizzBuzz create () {
		return new FizzBuzz(Arrays.asList(new BuzzRule(),
										  new FizzRule(),
										  new DefaultRule()));
	}
}