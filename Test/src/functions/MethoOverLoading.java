package functions;

public class MethoOverLoading {
	public static void main(String[] args) {
		MethoOverLoading mol = new MethoOverLoading();
		mol.sum(10, 20);
		
		
	}

	public void sum(int a,int b)
	{
	System.out.println(a+b);	
	}

	public void sum(int a,int b,int c)
	{
	System.out.println(a+b+c);	
	}
	
	public int sum(int a)
	{
	System.out.println(a);	
	return 0;
	}
}
