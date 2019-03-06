/*
 * the prefix class checks that an input is in the pre enum, which contains all of the legal prefixes
 * 
 * */

public class Prefix {
	//the String prefix is initialized to hold input
	private String prefix;
	//the pre enum is created, containing all legal prefixes
	private static enum pre
	{
		Mr,
		Mrs,
		Ms,
		Dr,
		None
	}
	
	//the constructor takes a string argument
	public Prefix(String prefix) {
		super();
		//the user input is checked with the inEnum() method before being assigned
		this.prefix = inEnum(prefix);
	}
	
	//the toString() method returns the contents of Prefix
	@Override
	public String toString() {
		return prefix;
	};
	
	//the method in Enum checks that the string is in the pre enum
	private static String inEnum(String prefix)
	{
		//first it does cap casing for the user using the name class's method CapsNum() in case they inputed all lowercase or uppercase characters
		prefix = Name.CapsNum(prefix);

		//the try block tries to get prefix out of the enum
		try 
		{
			pre.valueOf(prefix);		
		} 
		//if it is not there it is assigned to "Invalid"
		catch (Exception e) 
		{
			prefix = "Invalid ";
		}
		//prefix is always returned
		return prefix;
	}
	
	
	//the main method checks that he above code is working as intended
	public static void main(String[] args)
	{
		//a correct prefix is created
		Prefix pre = new Prefix("Dr");
		//an all lowercase prefix is created
		Prefix pre2 = new Prefix("mrs");
		//a prefix not included in the enum is created
		Prefix pre3 = new Prefix("lol");
		//a prefix that is blank is created
		Prefix pre4 = new Prefix(" ");
		//the contents of all of the above are printed to the screen
		System.out.println(pre);
		System.out.println(pre2);
		System.out.println(pre3);
		System.out.println(pre4);
	}
}
