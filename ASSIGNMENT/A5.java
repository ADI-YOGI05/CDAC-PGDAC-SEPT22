import java.util.Scanner;
public class A5 
{
    public static void main(String args[])
    {
        int m, year,month, week, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+year);
		month = m / 30;
		m = m % 30;
		System.out.println("No. of month:"+month);
	    week = m / 7;
        m = m % 7;
        System.out.println("No. of weeks:"+week);
        day = m;
        System.out.println("No. of days:"+day);
    }
}