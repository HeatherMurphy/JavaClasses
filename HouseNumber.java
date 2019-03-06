/*
 * The house number class checks for whether a house number is negative. If it is, it returns Invalid.
 * */
public class HouseNumber {
	//The varible holder string for the house number is created
  private String houseNumber;
  //the constructor for the House number objects takes a string variable
	public HouseNumber(String houseNumber) {
	super();
	//the input is checked with the notNeg() function before it is assigned
	this.houseNumber = notNeg(houseNumber);
 	}
	
	// the toString() returns the house number as output
	@Override
	public String toString() {
		return houseNumber + " ";
	}
	//the notNeg() function checks that the number inputted is not negative or.. not a number at all
	public static String notNeg(String houseNumber)
	{
		// the integer houseNum is initialized
		int houseNum;
		// the try block tries to convert houseNum into an integer
		try {
			// the integer is assigned to housenum
			houseNum = Integer.parseInt(houseNumber);
			// if the integer is less than zero it will not be accepted
			if (houseNum < 0 )
			{
				// houseNumber is assigned as Invalid
				houseNumber = "Invalid";
			}
		// if the user inputs letters or symbols the catch block will be used
		} catch (NumberFormatException e) {
			// house number is assigned as Invalid
			houseNumber = "Invalid";
		}
		//house number is returned to the caller
		return houseNumber;
	}
	// the main method is used to make sure the checks are working properly
 public static void main(String[] args){
	//A new house number is made as the house number object one. it is perfectly valid.
	HouseNumber one = new HouseNumber("123");
	// the  one object's value is printed to the screen
	System.out.println(one.toString());
	// a negative house number is created as the house number object two
	HouseNumber two = new HouseNumber("-9");
	// the two object's value is printed to the screen
	System.out.println(two.toString());
	// a new house number object is made called three. it contains a value of "nope" this contains characters and is invalid
	HouseNumber three = new HouseNumber("nope");
	// the three object's value is printed to the screen
	System.out.println(three.toString());
 }



}
