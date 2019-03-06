/*
 * the StreetType class checks that the input is within the accepted street types
 *  * */
public class StreetType {
	//the string streetType stores the user's input
	String streetType;
	//the typeOfStreet enum contains all of the acceptable values for streetType
	public static enum typeOfStreet{
		Ave,
		Ln,
		Rd,
		Circle,
		Ct,
		Jctn,
		Dr
	}
	
	//the constructor for StreetType takes a String argument
	public StreetType(String streetType) {
		super();
		//before the string is assigned it is checked by the inEnum(method)
		this.streetType = inEnum(streetType);
	}
	
	//the toString() method returns the contents of streetType
	@Override
	public String toString() {
		return streetType;
	}
	
	
	//the inEnum() method checks that the input is in the typeOfStreet enum 
	private static String inEnum(String type)
	{
		//type is made the correct casing using the Name.CapsNum() method
		type = Name.CapsNum(type);
		
		//the try block will try to get type out of the typeOfStreet enum
		try 
		{
			typeOfStreet.valueOf(type);		
		} 
		//if it is not there, the type varible will be assigned "Invalid"
		catch (Exception e) 
		{
			type = "Invalid ";
		}
		//type is always returned
		return type;
	}
	
	//the main method checks that the above class is working properly
	public static void main(String[] args)
	{
		//a StreetType is made that has incorrect casing
		StreetType street = new StreetType("ave");
		//a streetType is made that has an invalid value
		StreetType street1 = new StreetType("railroad");
		//a streetType is made that is blank
		StreetType street2 = new StreetType(" ");
		//all the above values are printed to the screen
		System.out.println(street.toString());
		System.out.println(street1.toString());
		System.out.println(street2.toString());
	}
}
