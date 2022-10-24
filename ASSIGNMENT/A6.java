import java.util.Scanner;
class A6
{
	double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble();
	    A6 fah=new A6( );
	    double result=fah.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	
}