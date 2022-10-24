import java.util.*;  
class A8   
{  
    public static void main(String a[])   
    {   double BasicSalary,HRA,DA,GrossSalary;
        System.out.println("Enter the value of BASIC SALARY");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/  
        BasicSalary = sc.nextDouble();
		
		if(BasicSalary<10000)
		{
		HRA= 0.1 * BasicSalary ;
		
		DA= 0.9 * BasicSalary ;
		
		GrossSalary = BasicSalary + HRA + DA ;
		
		System.out.println("Total GrossSalary  " + GrossSalary);
		}
		
		else{
		
		
		HRA= 2000 ;
		
		DA= 0.98 * BasicSalary ;
		
		GrossSalary = BasicSalary + HRA + DA ;
		
		System.out.println("Total GrossSalary  " + GrossSalary);
		
		}
		
		}
		
		}
		