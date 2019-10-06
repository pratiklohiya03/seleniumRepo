package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= new String[12];
str[0]="Pratik";
str[1]="Lohiya";
str[2]="Ashu";
str[3]="Tripathi";
str[4]="Tripathi Saheb";


for (int i=0;i<str.length;i++)
{
	System.out.println("Your Name is  "+str[i]);
}


//System.out.println(str.length);

/*for (String s:str)// s is local of far loop and str is name of array
{
	System.out.println("Your Name is  "+s);	
}*/
}

}
