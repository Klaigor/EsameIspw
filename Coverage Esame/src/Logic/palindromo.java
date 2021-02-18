package Logic;

public class palindromo {
	public boolean isPalindrome(String inputString) {
		char firstChar = inputString.charAt(0);
		char lastChar = inputString.charAt(inputString.length() - 1);
		
		if (firstChar == lastChar) {
			return true;
		}
		return false;
	}
}

