/*The MiddleInitial object takes a string and checks to make sure it has no special characters or numbers
 * It will take in a full length string, however it will only ever output the first character
 * */
public class MiddleInitial {
	// the string middleI is created to hold the middle initial within the class
	private String middleI;
	
	// the toString method is created to output the value middleI to the screen
	@Override
	public String toString() {
		return middleI;
	}
	
	// The constructor for middle initial takes in a string and uses  the CheckChar() method to make sure 
	// it is a valid non numberic and non symbolic input
	public MiddleInitial(String middleI) {
		super();
		this.middleI = CheckChar(middleI);
	}
	
	// the CheckChar() method takes a string and checks for symbols or numbers within it. It will shorten a full name
	// to just the first letter
	public String CheckChar (String c)
	{
		//first the cChar variable is made to hold the first character of the string
		char cChar = ' ';
		// It checks if the input is a blank space
		if(c == " ")
		{
			// If the input is a blank space, a blank char is assigned to cChar
			cChar = ' ';
		}
		else
		{
			//the new object C is created with String c
			Name C = new Name(c);
			//if the name object returns Invalid, then the middle initial will be set to Invalid
			// to let the user know that the input is incorrect
			if (C.toString() == "Invalid ")
			{
				//C.toString() will return Invalid if its contents are "Invalid "
				return C.toString();
			}
			// if the name is valid then the name is turned into a character array
			else
			{
				// cArray is assigned to the character array created from C
				char [] cArray = C.toString().toCharArray();
				//cChar is assigned the first character in C
				cChar = cArray[0];
			} 
		}
		//cChar is always returned as a string
		return Character.toString(cChar);
	}
	
	// this main class checks if the above code functions properly to check input
	public static void main(String[] args)
	{
		// a new MiddleInitial object is created called m. it is assigned "M"
		MiddleInitial m = new MiddleInitial("M");
		// a new MiddleInitial object is created called e. It is assigned a number
		MiddleInitial e = new MiddleInitial("1/23");
		// a new MiddleInitial object is created called b. It is assigned a blank space
		MiddleInitial b = new MiddleInitial(" ");
		// the contents of m are printed
		System.out.println(m);
		// the contents of e are printed
		System.out.println(e);
		// the contents of b are printed
		System.out.println(b);
	}

}
