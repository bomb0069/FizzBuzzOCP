package th.own.bomb0069.kata;

public class FizzRule implements Rule{

	public boolean isMatch (int number) {
		return number % 3 == 0;
	}

	public String say (int number) {
		return "Fizz";
	}

}
