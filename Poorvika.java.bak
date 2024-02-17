import java.util.Scanner;
class Poorvika 
{
	 static Scanner s=new Scanner(System.in);
	 static Mobile mobile1=new Mobile("mi","T470s","Black","14 inch","Android");
	 static boolean b=true;
	public static void main(String[] args)
	{
	do
	{
		System.out.println("Welcome to poorvika");
		System.out.println("Select the input");
		System.out.println("1.Insert sim\n 2.Remove sim\n 3.Details of Mobiles\n 4.Details of sim\n 5.Is sim present\n 6.Exit");
		int user_enter=s.nextInt();

		switch (user_enter)
		{
		case 1:{System.out.println("select the slot");
		        System.out.println("1.slot_1\n 2.slot_2");
				int sim_select=s.nextInt();

				if (sim_select==1)
				{
				 mobile1.insertsim1(new sim("jio","4G",649));
				}
				else if (sim_select==2)
				{
				 mobile1.insertsim2(new sim("Airtel","4G",639));
				}
			break;}
		case 2:{
			    System.out.println("select the slot");
		        System.out.println("1.slot_1\n 2.slot_2");
				int sim_select=s.nextInt();

				if (sim_select==1)
				{
					mobile1.removesim1();
				}
				else if(sim_select==2)
			    {
					mobile1.removesim2();
			    }
			break;}
		case 3:{
			    mobile1.detailsofmobile();
			break;}
		case 4:{
			    mobile1.detailsofsims();
		       break;}
		case 5:{
			     mobile1.issimpresent();
			break;}
		case 6:{
			 b=false;
			 System.out.println("\t\tThank you\t\t");
			break;}
		}

	}
	while (b);
}
}
