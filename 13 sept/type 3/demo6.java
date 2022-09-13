class demo6{

public static void main(String args[]){
	
	for(int i=5;i>0;i--)//rows
	{
		for(int j=4;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print("*");
			
		}
			for(int j=0;j<i-1;j++)//star
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
} 
}