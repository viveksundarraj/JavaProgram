class Armstrong 
{
	//import java.util.Scanner;
public class Armstrong{
	//static Scanner s=new Scanner(System.in);
	static int count;
	static int fact=1;
	public static void main(String[] args) {
		System.out.println("Enter the number");
		//int num= s.nextInt();
		int num=9474;
	     int temp=num;
	  while(num>0)
	  {
		num=num/10;
		count++;
	  }
	  num=temp;
	  while(num>0)
	  {
	  int last=num%10;
	  for(int i=1;i<=count;i++)
	  {
		  fact=fact*last;
	  }
	  } 
	System.out.println(fact);
		}
	
   }
}
