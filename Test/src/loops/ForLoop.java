package loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=1;i<4;++i)
		{
		for (int j=1;j<=3;j++)
		{
			System.out.println(i+""+j);
		}
		}
		
		
		// While LOOP
		
		int i=1;
		
		while(i<10)
		{
			System.out.println("I is "+i);
			
			i++;
		}
		

		//Do LOOP
		
		int j=1;
		
		do
		{System.out.println("value of j "+j);
		j++;
		}while(j<=10);
		
		

	}

}
