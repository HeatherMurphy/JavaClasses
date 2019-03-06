/*
 * the class name checks for casing. if the casing is wrong, it will convert it so the first letter is capital
 * and the rest are lower case
 * */
public class Name {
	//the String name is declared to hold the user's input
	private String name; 
	
	//The constructor method for Name takes a name string as an argument
	public Name(String name) {
		super();
		//name is assigned the user input, only after it is checked by the CapsNum() method
		this.name = CapsNum(name);
	}
	
	//This is a setter method, so that name can be reset
	public void setName(String name) {
		// name is set to the argument name's value
		this.name = name;
	}
	
	// the toString() method also allows for name to be printed to the screen
	@Override
	public String toString() {
		return  name;
	}
	
	// the CapsNum() method checks whether input is only letters, and for casing
	public static String CapsNum(String name)
	{
		//The charArray is created from the string 
		char[] stringArr = name.toCharArray();
		//a string is created to hold the new contents of the string
		String string = "";
		//a for loop iterates through the character array
		for(int i = 0; i < stringArr.length; i++)
		{
			//the char ch is assigned to the current character
			char ch = stringArr[i];
			//ch is checked if it is a letter or not
			if (Character.isLetter(ch) == true )
			{
				//if it is a letter then the first one is made uppercase
				// or if it is the first one after a blank space
				if (i == 0 || stringArr[i-1] == ' ')
				{
					//this converts the current character to uppercase
					ch = Character.toUpperCase(ch);
				}
				//if it is any other letter in the string it is converted to lower case
				else
				{
					//this converts the current character to lowercase
					ch = Character.toLowerCase(ch);
				}
				//the current converted char is added to the string
				string += ch;
			}
			//if the character is not a letter then it makes the name invalid
			else
			{
				//if the character is a blank space, that is acceptable 
				if (i > 0 && stringArr[i] == ' ')
				{
					//the blank space is added to the string
					string += ch;
				}
				//if the character is anything but a letter or blank space it is made invalid
				else{
				//the string is given the value "invalid" the loop is then broken
				//and Invalid will be returned
				string = "Invalid ";
				break;
				}
			}

		}
		//name is given the value string
		name = string;
		//name is returned
		return name;
	}

	//the main method to test the checks in Name class
	public static void main (String[] args)
	{
		//a new name object is created including / symbols
		Name james = new Name("Jam//");
		//a new name object is created including a space
		Name jimmy = new Name("Jimmy one");
		//the value of the james object is printed to the screen
		System.out.println(james.toString());
		//the value of the jimmy object is printed to the screen
		System.out.println(jimmy.toString());

	}

}
