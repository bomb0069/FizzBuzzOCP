package th.own.bomb0069.kata;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzzFactory {
	
	public static FizzBuzz create () {
		List<Rule> rules = new ArrayList<Rule>();
		rules.add(new DefaultRule());
		return new FizzBuzz(rules);
	}
}