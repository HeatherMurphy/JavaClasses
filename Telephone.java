/*
 * The Telephone class puts together  two AreaCode objects and a PhoneEnding object to create
 * a full telephone number
 * */
public class Telephone {
	//two area code type variables are created 
	//they hold the areaCode and the exchange
	AreaCode areaCode;
	AreaCode exchange;
	//one phone ending type variable is created which holds the 4 digit ending of the phone number
	PhoneEnding ending;
	
	//the constructor takes two areaCode objects and one PhoneEnding object
	public Telephone(AreaCode areaCode, AreaCode exchange, PhoneEnding ending) {
		this.areaCode = areaCode;
		this.exchange = exchange;
		this.ending = ending;
	}
	
	//the toString method returns the value of telephone in the correct phone number format
	@Override
	public String toString() {
		return "(" + areaCode + ")-" + exchange + "-" + ending;
	}
	
	//the main method checks that the above code is working as intended
	public static void main (String[] args)
	{
		//new AreaCode objects and one PhoneENding object are created
		AreaCode code = new AreaCode("201");
		AreaCode ex = new AreaCode("345");
		PhoneEnding end = new PhoneEnding("0000");
		//the above objects are put into the Telephone object's constructor
		Telephone tel = new Telephone(code, ex, end);
		//the contents of tel are printed to the screen
		System.out.println(tel.toString());
	}

}
