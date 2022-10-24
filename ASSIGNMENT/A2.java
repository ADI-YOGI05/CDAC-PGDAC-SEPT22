import java.util.Scanner;  
public class A2 
{  
public static void main(String args[])  
{  
double circumference, area;   
int radius;  
//object of the Scanner class  
Scanner sc=new Scanner (System.in);  
System.out.print("Enter the radius of the circle: ");  
radius=sc.nextInt();  
//calculating area of circle  
area=Math.PI*(radius*radius);  
//prints the calculated area  
System.out.println("The area of the circle is: "+area);  
//calculating circumference of circle  
circumference=Math.PI*2*radius;  
//prints the calculated circumference  
System.out.println("The circumference of the circle is: "+circumference);  
}  
}  