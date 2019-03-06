/*
 * The Suffix class checks that the input is a valid suffix
 * 
 * */
public class Suffix {
	//the string suffix is initialized to record input
	private String suffix;
	//the suff enum contains all valid suffixes
	private static enum suff
	{
		Jr,
		Sr,
		Esq
	};
	
	//the constructor takes in a string from the user
	public Suffix(String suffix) {
		super();
		//the input is checked using the inEnum() method before it is assigned
		this.suffix = inEnum(suffix);	
	}
	
	
	//the toString() method returns the value of suffix
	@Override
	public String toString() {
		return suffix;
	}
	
	
	//the inEnum() method checks that the input is in the suff enumeration
	private static String inEnum(String suffix)
	{
		//the suffix input is made into the proper casing using the CapsNum() method from Name
		suffix = Name.CapsNum(suffix);
		//the try block tries to get the value of suffix from the suffix enum
		try {
			suff.valueOf(suffix);	
		} 
		//if it is not there "Invalid" is assigned to suffix
		catch (Exception e) {
			suffix = "Invalid ";
		}
		//suffix is always returned
		return suffix;
	}
	


	//the main class checks that the above code is working as intended
	public static void main (String[] args)
	{
		//a correct suffix is created
		Suffix suff = new Suffix("esq");
		//an incorrect suffix is created
		Suffix suff3 = new Suffix("lol");
		//a blank suffix is created
		Suffix suff4 = new Suffix(" ");
		//all of the above suffixes are printed to the screen
		System.out.println(suff);
		System.out.println(suff3);
		System.out.println(suff4);
		

		
	}

}
