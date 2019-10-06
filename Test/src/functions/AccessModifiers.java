package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AccessModifiers am=new AccessModifiers();
	am.publicFuncition();
	am.privateFuncition();
	am.proctedFuncition();
	am.noAccessFuncition();
		
	}
	
	public void publicFuncition()
	{
		System.out.println("This is public function");
	}
	
	private void privateFuncition()
	{
		System.out.println("This is private function");
	}
	
	protected void proctedFuncition()
	{
		System.out.println("This is protected function");
	}
	
	void noAccessFuncition()
	{
		System.out.println("This is no access specified function");
	}

}
