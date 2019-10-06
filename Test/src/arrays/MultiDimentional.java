package arrays;

public class MultiDimentional {

	public static void main (String args[])
	{
		String data[][]= new String[3][2];
		
		data[0][0]="Pratik";
		data[0][1]="Lohiya";
		data[1][0]="Ashu";
		data[1][1]="Tripathi";
		data[2][0]="Atul";
		data[2][1]="Dubey";
//to find the lenth of multidimensional array you need to first go to row index , and then use length 		
//		eg:
		for (int i=0;i<data.length;i++)
		{
			for (int j=0;j<data[i].length;j++) // here data[i] is row index and then we are using length
			{
				System.out.print(" "+data[i][j]);
			}
				System.out.println("");
		}
		
	}
	
}
