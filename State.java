/*
 * the state class checks that the two letter state code inputed is one of the fifty states
 * */

public class State {
	//the string state is created to hold input
	String state;
	
	//the state constructor takes a string arguments
	public State(String state) {
		super();
		//state is assigned the input after it is checked by the method inEnum()
		this.state = inEnum(state);
	}
	
	//the toString() method returns the value of state
	@Override
	public String toString() {
		return state;
	}
	
	//the enum states contains the two letter codes for all 50 states
	private enum states{
		AK,AZ,AR,CA,CO,CT,DE,DC,FL,GA,HI,ID,IL,IN,IA,KS,KY,LA,ME,MT,NE,NV,NH,NJ,NM,NY,NC,ND,OH,OK,OR,MD,MA,MI,MN,MS,MO,PA,RI,SC,SD,TN,TX,UT,VT,VA,WA,WV,WI,WY
	}
	
	//the method inEnum() checks whether the input is contained in the enum
	private static String inEnum(String state)
	{
		//the input is changed to all uppercase in case the input had incorrect casing
		state = state.toUpperCase();
		//the try block tries to get state out of the state enum
		try {
			states.valueOf(state);	
		} 
		//if it is not in the enum, the catch block changes its value to "Invalid"
		catch (Exception e) {
			
			state = "Invalid ";
		}
		//state is alwaye returned
		return state;
	}
	
	//the main class checks that the above class is working as intended
	public static void main(String[] args)
	{
		// a new state with incorrect casing is created
		State ar = new State("ar");
		// a new state that does not exist is created
		State hp = new State("hp");
		// a new blank state is created
		State blank = new State(" ");
		//the value of all of the above are printed to the screen
		System.out.println(ar.toString());
		System.out.println(hp.toString());
		System.out.println(blank.toString());
	}
}
