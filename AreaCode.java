/* The Area Code class takes in string input and checks for validity
 * the code can not be smaller than 199
 * It cannot be negative, or larger than three digits
 * */

public class AreaCode {
	// a string to hold the inputed code
	private String code;
	
	//Area code's constructor method takes in a string called code
	public AreaCode(String code) {
		// the code variable is checked for validity using the isValid method, then assigned to code.
		this.code = isValid(code);
	}
	
	// the toString() method returns the code string
	@Override
	public String toString() {
		return code;
	}
	
	// the isValid method checks for the input
	private static String isValid(String num)
	{
		// checks whether it is the correct length. it must be 3 characters.
		if (num.length() > 3 || num.length() < 3)
		{
			//num becomes the string "Invalid" which lets the user know something was inputed improperly
			num = "Invalid";
			// num now is returned back to the caller
			return num;
		}
		//the try method is used on the operation Integer.parseInt(), this way the program will not crash if the 
		//user inputs an area code with symbols or letters
		try {
			// num is turned into an integer datatype called number
			int number = Integer.parseInt(num);
			// number is checked if it is smaller than 199
			if (number <  199)
			{
				//if it is larger, the num variable is set to Invalid to let the user know something is wrong
				num = "Invalid";
			}
		// this catch method prevents program crashing by performing a specific task if the number format exception is encounter 
			//(ie: the user put letters or symbols as the area code)
		} catch (NumberFormatException e) {
			// If number format exception is encountered num is set to Invalid
			num = "Invalid";
		}
		// num is returned to the caller
		return num;
	}
	
	//the main method which tests the various checks in the AreaCode class
	public static void main(String[] args)
	{
		// an area code is created with a value that is too long
		AreaCode code = new AreaCode("2010");
		// the output is printed
		System.out.println(code.toString());
		// an area code with a value that is too small is created
		AreaCode code1 = new AreaCode("000");
		// the output is printed
		System.out.println(code1.toString());
		// a correct area code is created
		AreaCode code2 = new AreaCode("314");
		// the output is printed
		System.out.println(code2.toString());
		// an area code that is too short is created
		AreaCode code3 = new AreaCode("0");
		// the output is printed
		System.out.println(code3.toString());
	}


}
