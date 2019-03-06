/*
 * The PersonName object creates names using the Prefix, Name, MiddleInitial, and Suffix classes
 * */
public class PersonName {
	//the variables of type Prefix, Suffix, MiddleInitial, and 2 of type name are initialized
	Prefix pre;
	Suffix suff;
	MiddleInitial m;
	Name first;
	Name last;
	
	//this constructor takes in a Prefix, 2Names, MiddleInitial, and suffix. 
	//it uses all of the instatiated variables
	public PersonName(Prefix pre, Name first, MiddleInitial m, Name last, Suffix suff) {
		super();
		this.pre = pre;
		this.suff = suff;
		this.m = m;
		this.first = first;
		this.last = last;
	}

	//this constructor omits the suffix.
	public PersonName(Prefix pre, Name first, MiddleInitial m, Name last) {
		super();
		this.pre = pre;
		this.m = m;
		this.first = first;
		this.last = last;
	}

	//this constructor omits the middle name
	public PersonName(Prefix pre, Name first, Name last, Suffix suff) {
		super();
		this.pre = pre;
		this.suff = suff;
		this.first = first;
		this.last = last;
	}
	
	//this constructor omits both the suffix and middle name
	public PersonName(Prefix pre, Name first, Name last) {
		super();
		this.pre = pre;
		this.first = first;
		this.last = last;
	}

	// the toString method returns the contents of the object
	@Override
	public String toString() {
		//if both the middle initial were omitted, they will not be returned
		if (suff == null && m == null)
		{
			return pre + " " + first + " " + last;
		}
		//if the suffix was omitted, it will not be returned
		if (suff == null)
		{
			return pre + " " + first + " " + m + " " + last;
		}
		//if the middle initial was omitted, it will not be returned
		if (m == null)
		{
			return pre + " " + first + " " + last + " " + suff;
		}

		//if nothing was omitted, then everything is returned
		return pre + " " + first + " " + m + " " + last + " " + suff;
	}
	
	//the main method checks if the above code is working as intended
	public static void main (String[] args)
	{
		//a new prefix, middle initial, first and last name are created
		Prefix pre = new Prefix("Mrs");
		MiddleInitial m = new MiddleInitial("L");
		Name first = new Name ("Alicia");
		Name last = new Name ("Person");
		//the personName alicia is created, she omits the suffix
		PersonName alicia = new PersonName(pre, first, m, last);
		//the contents of alicia is printed to the screen
		System.out.println(alicia.toString());

		//a new prefix, middle initial, first and last name are created
		Prefix pre1 = new Prefix("Lol");
		Suffix suff1 = new Suffix("Lol");
		Name first1 = new Name ("A1ex");
		Name last1 = new Name ("M@n");
		//the personName alex is created, everything about his name is incorrect, a middle name is omitted
		PersonName alex = new PersonName(pre1, first1, last1, suff1);
		//the contents of alex are printed to the screen
		System.out.println(alex.toString());
		
		//a new prefix, middle initial, first and last name are created
		Prefix pre2 = new Prefix("dr");
		Suffix suff2 = new Suffix("sr");
		MiddleInitial m2 = new MiddleInitial("john");
		Name first2 = new Name ("hans");
		Name last2 = new Name ("joergensen");
		//the personName hans is created, none of the casing is correct
		PersonName hans = new PersonName(pre2, first2, m2, last2,suff2);
		//the contents of hans are printed to the screen
		System.out.println(hans.toString());
		
		//a new prefix, middle initial, first and last name are created
		Prefix pre3 = new Prefix("mr");
		Name first3 = new Name ("jim");
		Name last3 = new Name ("smith");
		//the personName jim is created, he only has a prefix first and last name
		PersonName jim = new PersonName(pre3, first3, last3);
		//the contents of jim are printed to the screen
		System.out.println(jim.toString());
	}


}
