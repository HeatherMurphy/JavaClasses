/*
 * the Phone ending class checks the 4 last digits of the phone number to ensure they
 * are not negative and are in fact only 4 digits
 * */
public class PhoneEnding {
	//the string phoneEnd is initiated to store the input
	private String phoneEnd;
	
	//the constructor phoneEnding is created. it takes the a string as an argument
	public PhoneEnding(String phoneEnd) {
		//the isNotNeg method checks for validity before it assigned
		this.phoneEnd = isNotNeg(phoneEnd);
	}
	
	
	// the toString() method returns the contents of phoneEnd
	@Override
	public String toString() {
		return phoneEnd;
	}
	//the isNotNeg method checks for length and that the input is not negative
	private static String isNotNeg(String num)
	{
		//first the try block tries to convert the string to an integer
		try {
			//the integer is assigned to the int variable number
			int number = Integer.parseInt(num);
			//the number is checked that is is not negative and has a length of exactly 4 digits
			if (number < -1  || num.length() != 4)
			{
				num = "Invalid";
			}
		// if the parseInt() method throws a number format exception then the number is called invalid
		} catch (NumberFormatException e) {
			//num is assigned Invalid
			num = "Invalid";
		}
		//num is always returned
		return num;
	}
	
	//the main class checks if the above code is working as intended
	public static void main(String[] args)
	{
		//a phoneEnding is created that is all zeroes
		PhoneEnding end = new PhoneEnding("0000");
		//the contents are printed
		System.out.println(end.toString());
		//a phoneEnding is created that contains only a 0
		PhoneEnding end1 = new PhoneEnding("0");
		//its contents are printed
		System.out.println(end1.toString());
		//a phoneEnding is created that contains a negative number
		PhoneEnding end2 = new PhoneEnding("-4000");
		//its contents are printed
		System.out.println(end2.toString());
	}

}
