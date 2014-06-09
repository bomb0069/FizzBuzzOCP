package th.own.bomb0069.kata;

public class DefaultRule implements Rule{

	public boolean isMatch (int number) {
		return true;
	}

	public String say (int number) {
		return String.valueOf(number);
	}

}
