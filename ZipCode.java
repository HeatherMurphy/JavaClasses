/*
 * The ZipCode class checks that the zip code is the correct length, not negative, and only numbers
 * */
public class ZipCode {
	//the variable zip holds the user's input
	String zip;

	//ZipCode's constuctor takes in a string object
	public ZipCode(String zip) {
		super();
		//the input is checked by isNumber() before it is assigned
		this.zip = isNumber(zip);
	}
	//the toString() method returns the value of zip
	public String toString(){
		return zip;
	}
	
	//the isNumber() method checks whether the input is numeric, and is exactly 5 numbers long
	private static String isNumber(String num){
		//the try block tries to convert the input string into an int and assign it to number
		try {
			int number = Integer.parseInt(num);
			//once the input is an int, it is checked for negative values, 
			//and the string value is checked that is is 5 characters in length
			//if either of these are false, the input is assigned to "Invalid"
			if (number < 0 || num.length() != 5)
			{
				num = "Invalid";
			}
		//if the parstInt() method throws an exception num is assigned to "Invalid"
		} catch (NumberFormatException e) {
			num = "Invalid";
		}
		//num is always returned
		return num;
	}
	//the main method checks that the above code is working as itended
	public static void main(String[] args){
		//a correct zipcode is made
		ZipCode zip = new ZipCode("07652");
		//a short zipcode is made
		ZipCode zip1 = new ZipCode("076");
		//a zipcode with letters is made
		ZipCode zip2 = new ZipCode("abcde");
		//all of the zipcodes above are printed to the screen
		System.out.println(zip.toString());
		System.out.println(zip1.toString());
		System.out.println(zip2.toString());
	}

}
