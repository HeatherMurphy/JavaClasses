/*
 * the mailing label class combines the PersonName Class and the Name class
 * It returns one Mailing Label with the person's name at the top
 * */

public class MailingLabel {
	// the string mailing label is created
	private String mailingLabel;
	// mailing label's constructor takes in a PersonName type object, and an Address type object
	public MailingLabel(PersonName name, Address address) {
		super();
		//the mailing label variable is assigned the output of the toMailingLabel() method
		this.mailingLabel = toMailingLabel(name,address);
	}
	// the toString() method outputs the mailing label string to the screen
	@Override
	public String toString() {
		return mailingLabel;
	}
	
	//the toMailingLabel() method takes in the PersonName object and the Address object and creates a concatenated string.
	// the method is private, as is will only be called by the constructor
	private static String toMailingLabel(PersonName name, Address address){
		String mailingLabel = name.toString() + "\n" + address.toString();
		// the string is returned to the caller, which will always be the constructor
		return mailingLabel;
	}
	
	public static void main(String[] args)
	{
		// creating a house number object called one to input into address
		HouseNumber one = new HouseNumber("1");
		// creating a name object called streetOne to put as the street name
		Name streetOne = new Name("haiacynth");
		// creating a StreetType object called typeOne to input ast the streetType
		StreetType typeOne = new StreetType("Ave");
		// creating a Name object called cityOne to input as the city name
		Name cityOne = new Name("Flower Grove");
		// creating a State object called stateOne to input as the state
		State stateOne = new State("NY");
		// creating a Zipcode object called zipOne to input as the zipcode
		ZipCode zipOne = new ZipCode("05067");
		// creating the address object called address with all of the values created above
		Address address = new Address(one, streetOne, typeOne, cityOne, stateOne, zipOne);
		
		
		//a new prefix object called pre is created to input Mrs
		Prefix pre = new Prefix("Mrs");
		// a new MiddleInitial object is created with the value "L"
		MiddleInitial m = new MiddleInitial("L");
		// a new name object is created called first. It holds the value "Alicia"
		Name first = new Name ("Alicia");
		// a new name object is created called last. It holds the value "Person"
		Name last = new Name ("Person");
		// a new PersonName object is created using the above objects
		PersonName alicia = new PersonName(pre, first, m, last);
		// the new mailing label object called aliciaMail is created using the address called address
		//and the personName called alicia
		MailingLabel aliciaMail = new MailingLabel(alicia, address);
		//the aliciaMail objects contents are printed to the screen
		System.out.println(aliciaMail.toString());
	}
	

}
