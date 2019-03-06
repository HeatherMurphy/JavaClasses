/*
 * The PersonMap class contains two maps, three PersonName Objects, three Telephone Objects and three Mailing Label objects
 * The PersonMail map, maps people to Mailing labels
 * The PersonTel map, maps people to telephone numbers
 * */


//imports for the Hasmap and map objects
import java.util.HashMap;
import java.util.Map;

public class PersonMap {
	//the PerosonMail hashmap is created
	//it links the string of the person's name to their mailing label.
	public static Map PersonMail = new HashMap<String, MailingLabel>();
	//the PersonTel hashmap is created
	// it links the string of the person's name to their telephone number.
	public static Map PersonTel = new HashMap<String, Telephone>();
	
	// the constructor for personmap takes no arguments
	// it simply makes the objects necessary for the maps to work
	public PersonMap() {
		//the MakeMaps() method makes all of the objects
		MakeMaps();
		
	}
	
	// the MakeMaps() method takes in no arguments
	// it makes the objects and puts them into the PersonMail, and PersonTel maps.
	private static void MakeMaps(){
		
		//the prefix,  middleInitial, first and last name are made for the Person name object alicia
		Prefix pre = new Prefix("Mrs");
		MiddleInitial m = new MiddleInitial("L");
		Name first = new Name ("Alicia");
		Name last = new Name ("Person");
		//the PersonName object alicia is created using the above objects
		PersonName alicia = new PersonName(pre, first, m , last);
		
		//the housenumber, streettype, 2 names, state, and zipcode are made for the address object
		HouseNumber one = new HouseNumber("1");
		Name streetOne = new Name("haiacynth");
		StreetType typeOne = new StreetType("Ave");
		Name cityOne = new Name("Flower Grove");
		State stateOne = new State("NY");
		ZipCode zipOne = new ZipCode("05067");
		//the address object is created using the above objects
		Address address = new Address(one, streetOne, typeOne, cityOne, stateOne, zipOne);
		//a mailing label object is creates using the address addressObject and the alicia PersonName object
		MailingLabel aliciaMail = new MailingLabel(alicia, address);
		
		//the 2 areacode objects, and exchange oject are created for the telephone object 
		AreaCode code = new AreaCode("201");
		AreaCode ex = new AreaCode("345");
		PhoneEnding end = new PhoneEnding("0000");
		//the tel object is created using the above objects
		Telephone tel = new Telephone(code, ex, end);
		
		//the prefix, suffix, middleInitial, first and last name are made for the Person name object hans
		Prefix pre2 = new Prefix("dr");
		Suffix suff2 = new Suffix("sr");
		MiddleInitial m2 = new MiddleInitial("john");
		Name first2 = new Name ("hans");
		Name last2 = new Name ("joergensen");
		//the PersonName object hans is created using the above objects
		PersonName hans = new PersonName(pre2, first2, m2, last2,suff2);
		
		//the housenumber, streettype, 2 names, state, and zipcode are made for the address3 object
		HouseNumber three = new HouseNumber("1001");
		Name streetThree = new Name("Lione");
		StreetType typeThree = new StreetType("dr");
		Name cityThree = new Name("Plainfield");
		State stateThree = new State("ak");
		ZipCode zipThree = new ZipCode("12345");
		//the address3 object is created using the above objects
		Address address3 = new Address(three, streetThree, typeThree, cityThree, stateThree, zipThree);
		//a mailing label object is creates using the address3 addressObject and the hans PersonName object
		MailingLabel hansMail = new MailingLabel(hans, address3);
		
		//the 2 areacode objects, and exchange oject are created for the tel3 object
		AreaCode code3 = new AreaCode("302");
		AreaCode ex3 = new AreaCode("334");
		PhoneEnding end3 = new PhoneEnding("4925");
		//the tel3 object is created using the above objects
		Telephone tel3 = new Telephone(code3, ex3, end3);

		//the prefix, suffix, middleInitial, first and last name are made for the Person name object alex
		Prefix pre1 = new Prefix("Mr");
		Suffix suff1 = new Suffix("Jr");
		MiddleInitial m1 = new MiddleInitial("george");
		Name first1 = new Name ("Alex");
		Name last1 = new Name ("Man");
		//the PersonName object alex is created using the above objects
		PersonName alex = new PersonName(pre1, first1, m1, last1, suff1);
		
		//the housenumber, streettype, 2 names, state, and zipcode are made for the address2 object
		HouseNumber two = new HouseNumber("123");
		Name streetTwo = new Name("Seabreeze");
		StreetType typeTwo = new StreetType("ln");
		Name cityTwo = new Name("New City");
		State stateTwo = new State("ct");
		ZipCode zipTwo = new ZipCode("08765");
		//the address2 object is created using the above objects
		Address address2 = new Address(two, streetTwo, typeTwo, cityTwo, stateTwo, zipTwo);
		//a mailing label object is creates using the address2 addressObject and the alex PersonName object
		MailingLabel alexMail = new MailingLabel(alex, address2);
		
		//the 2 areacode objects, and exchange oject are created for the tel2 object
		AreaCode code1 = new AreaCode("204");
		AreaCode ex1 = new AreaCode("299");
		PhoneEnding end1 = new PhoneEnding("8000");
		//the tel3 object is created using the above objects
		Telephone tel1 = new Telephone(code1, ex1, end1);
		
		//the hans, alex, and alicia objects are put in the PersonMail map
		//with their respected mailing labels
		PersonMail.put("hans", hansMail);
		PersonMail.put("alex", alexMail);
		PersonMail.put("alicia", aliciaMail);
		//the hans, alex, and alicia objects are put in the PersonTel map 
		//with their respective phone numbers
		PersonTel.put("hans", tel3);
		PersonTel.put("alex", tel1);
		PersonTel.put("alicia", tel);
		
	}
	

		
	//the main method checking if the above code works as intended
	public static void main(String[] args)
	{
		//the personMap object is created
		PersonMap personMap = new PersonMap();
		
		//the string "alicia" is put into the PersonMail and PersonTel map, and printed
		System.out.println(personMap.PersonMail.get("alicia"));
		System.out.println(personMap.PersonTel.get("alicia") + "\n");
		//the string "alex" is put into the PersonMail and PersonTel map, and printed
		System.out.println(personMap.PersonMail.get("alex"));
		System.out.println(personMap.PersonTel.get("alex") + "\n");
		//the string "hans" is put into the PersonMail and PersonTel map, and printed
		System.out.println(personMap.PersonMail.get("hans"));
		System.out.println(personMap.PersonTel.get("hans"));
		

		
	}

}
