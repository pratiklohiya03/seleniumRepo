package functions;

public class FirstFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum();
		int a=sum(20,30);
		int b=sum(50,50);
		System.out.println(a+b);
		NonStatic ns= new NonStatic();
		System.out.println(ns.sum(25, 35));
		
	}
/*public static void sum()
{
	int i=10;
	int j=20;
	int sum= i+j;
	System.out.println(sum);
}
*/
public static int sum(int a,int b)
{

	int sum= a+b;
	return sum;
}

}
