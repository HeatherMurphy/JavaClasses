/*The address class takes all of the components of and address and puts them together
 * it takes as arguments the house number, street name, street type, city name, state, and zip code.
 * It has a toString method which prints out a mailing label without a name.
 * */

public class Address {
	// a variable to store the house number of type house number
	HouseNumber houseNumber;
	// a variable to store the street name of type Name (to check for casing)
	Name streetName;
	// a variable to store the street's type. of type StreetType which checks an enum to verify.
	StreetType streetType;
	// a variable to store the city name of type Name (to check for casing)
	Name CityName;
	// a variable to store the 2 letter state code of type state which checks an enum with all 50 state codes to verify.
	State state;
	// a variable to store the 5 digit zipcode of type ZipCode which checks for length, and negative entries.
	ZipCode zip;
	
	//Constructor for Address which takes house number, street, street type, city name, and zipcode.
	public Address(HouseNumber houseNumber, Name streetName, StreetType streetType, Name cityName, State state,
			ZipCode zip) {
		super();
		//the variables are assigned to the user entries
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		CityName = cityName;
		this.state = state;
		this.zip = zip;
	}
	
	@Override
	//a method which provides the string output of all of the user's entry in the form of a mailing address
	public String toString() {
		return houseNumber + " " + streetName + " " + streetType
				+ "\n" + CityName + " " + state + " " + zip;
	}
	// main method for testing
	public static void main (String[] args)
	{
		// a HouseNumber, 2 name, StreetType , state, and zipcode objects are made to input into Address
		HouseNumber one = new HouseNumber("1");
		Name streetOne = new Name("haiacynth");
		StreetType typeOne = new StreetType("Ave");
		Name cityOne = new Name("Flower Grove");
		State stateOne = new State("NY");
		ZipCode zipOne = new ZipCode("05067");
		
		// creating the address object called address with all of the values created above
		Address address = new Address(one, streetOne, typeOne, cityOne, stateOne, zipOne);
		
		// toString() method is used to print out the mailing address
		System.out.println(address.toString());
		
		// an invalid house number of - 12 is made as a house number object
		HouseNumber one1 = new HouseNumber("-12");
		// an invalid streetname is created with an illegal forward slash character
		Name streetOne1 = new Name("Haiacynt/h");
		// a street type is inputted that does not match a street type
		StreetType typeOne1 = new StreetType("raceway");
		// a city name of all numbers is made
		Name cityOne1 = new Name("098754");
		// a state code is inputted that does not match a state
		State stateOne1 = new State("GH");
		// a zipcode including a letter is created
		ZipCode zipOne1 = new ZipCode("05067a");
		// the invalid inputs are put into address
		Address address1 = new Address(one1, streetOne1, typeOne1, cityOne1, stateOne1, zipOne1);
		// the invalid inputs are printed with the toString() method
		System.out.println(address1.toString());
	}

}
