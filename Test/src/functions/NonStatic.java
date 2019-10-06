package functions;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic ns=new NonStatic();
		System.out.println(ns.sum(10,20));
		
		System.out.println(FirstFunction.sum(40,50 ));
		
		AccessModifiers am=new AccessModifiers();
		
		
		
	}

	public int sum(int a,int b)
	
	{
		return a+b;
	}
	
}
