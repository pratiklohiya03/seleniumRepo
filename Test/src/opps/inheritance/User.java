package opps.inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone sp= new SmartPhone();
		
		sp.internet();
		sp.calling();
		sp.texting();

		
		//Telephone phone= new Telephone();
		
		//phone.calling();
		
	Telephone phone= new Telephone();
		
		phone.calling();
		
		 phone= new Mobile();
		
		phone.calling();
		
	}

}
