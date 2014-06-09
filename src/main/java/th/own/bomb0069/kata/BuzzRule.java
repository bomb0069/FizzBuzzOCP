package th.own.bomb0069.kata;

public class BuzzRule implements Rule{

	public boolean isMatch (int number) {
		return number % 5 == 0;
	}

	public String say (int number) {
		return "Buzz";
	}

}
