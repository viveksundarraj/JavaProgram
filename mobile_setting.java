import java.util.Scanner;
class mobile_setting
{
	static Scanner s=new Scanner(System.in);
	static Mobiles m=new Mobiles("16gb",12000);
	static boolean exit=true;
	
	public static void main(String[] args)
	{
	do
	{
		System.out.println("select the input");
		System.out.println("1.connect the watch\n 2.Disconnect Watch\n 3.detailsofmobiles\n 4.details of watch\n 5.exit");
		int input=s.nextInt();

		switch(input)
		{
		case 1:{ m.connectwatch(new smartwatch("mi","color",12000));
			break;}
		case 2:{ m.disconnectwatch();
			break;}
		case 3:{ m.detailsofmobiles();
			break;}
		case 4:{ m.detailsofwatch();
			break;}
		case 5:{ exit=false;
			break;}
		}
	}while(exit);
	}
}
