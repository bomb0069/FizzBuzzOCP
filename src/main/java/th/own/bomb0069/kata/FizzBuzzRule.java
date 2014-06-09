package th.own.bomb0069.kata;

public class FizzBuzzRule implements Rule{

	public boolean isMatch (int number) {
		return number % 3 == 0 && number % 5 == 0;
	}

	public String say (int number) {
		return "FizzBuzz";
	}

}
