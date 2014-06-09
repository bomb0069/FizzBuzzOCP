package th.own.bomb0069.kata;

import java.util.List;

public class FizzBuzz {

	List<Rule> rules;

	public FizzBuzz (List<Rule> rules) {
		this.rules = rules;
	}

	public String say(int number) {
		for (Rule rule : rules) {
			if (rule.isMatch(number))
				return rule.say(number);
		}
		return "";
	}
}