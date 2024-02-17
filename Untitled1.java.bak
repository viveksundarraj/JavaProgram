import.java.util Scanner;
class mobile_setting
{
	static Scanner s=new Scanner(System,in);
	Mobiles m=new Mobiles("16gb",12000)
	boolean exit=true;
	
	while (exit)
	{
		System.out.println("select the input");
		System.out.println("1.connect watch\n 2.Disconnect Watch\n 3.detailsofmobiles");
		int input=s.nextInt();

		switch (input)
		{
		case 1:{ m.connectwatch(new smartwatch("xiaomi","blue",27000));
			break;}
		case 2:{ m.disconnectwatch(new smartwatch());
			break;}
		case 3:{m.detailsofmobile();
			break;}
		default exit=false;
		
		}
	}
}
