import java.util.Scanner;
class Ceo_driver
{
	static Scanner s=new Scanner(System.in);
	//static Development d1=new Development("java","webtech","advance java","python");
	static String a;
	static boolean b=true;
	public static void main(String[] args)
	{
		Development d1=new Development("java","webtech","advance java","python");
		Ceo c1=new Ceo("vivek",6382739899l,"chennai","B.E");
		System.out.println("\t\t\tWELCOME\t\t\t");
		  input();
		do
		{
			//System.out.println("Select the input");
			//System.out.println("1.Details of CEO\n 2.Details of Qspider branches\n 3.Details of Jspider branches\n 4.Details of Qspider trainers\n 5.Details of Jspider trainer\n 6.add trainer\n 7.Remove trainers\n 8.Add Qspider branches\n 9.Remove Qspider branches\n 10.Add Jspider branches\n 11.Remove Jspider branches/n 12.Is testing present\n 13.Is development present\n 14.Details of qspider trainers skill\n 15.Details of Jspiders trainers skills\n 16.Exit ");
		   //int input=s.nextInt();
			
             int input=s.nextInt();
			switch (input)
			{
			case 1:{System.out.println("\t\t\tDetails of CEO\t\t\t");
			        c1.detailsofceo();
					System.out.println("0.Go back");
					       int go_back=s.nextInt();
			            if (go_back==0)
			           {
                         input();
			           }
				break;}
			case 2:{System.out.println("\t\t\tDetails of Qspider branches\t\t\t");
			        System.out.println("which branch details you want\n 1.vadapalani\n 2.Bangalore");
			        int input1=s.nextInt();

					if (input1==1)
					{
						c1.t1.qs1.detailsofqspider();
					}
					else if (input1==2)
					{
                        c1.t1.qs2.detailsofqspider();   
					}
					 System.out.println("0.Go back");
					  int go_back=s.nextInt(); 
			          if (go_back==0)
			          {
                      input();
			          }
				break;}
			 case 3:{System.out.println("\t\t\tDetails of Jspider branches\t\t\t");
			        System.out.println("which branch details you want\n 1.vadapalani\n 2.Bangalore");
			        int input2=s.nextInt();

					if (input2==1)
					{
						Jspider js1=new Jspider("vadapalani","Vadivel",1299);
						js1.detailsofjspider();
					}
					else if (input2==2)
					{
						Jspider js2=new Jspider("bangalore","eswaran",1260);
                        js2.detailsofjspider(); 
					}
					 System.out.println("0.Go back");
					       int go_back=s.nextInt();
			            if (go_back==0)
			           {
                         input();
			           }
				 break;}
			case 4:{System.out.println("\t\t\tDetails of Qspider trainers\t\t\t");
					c1.t1.qs1.qt1.detailsofqtrainer();
					System.out.println("************************");
					c1.t1.qs1.qt2.detailsofqtrainer();
					System.out.println("************************");
		            c1.t1.qs2.qt3.detailsofqtrainer();
					System.out.println("************************");
		            c1.t1.qs2.qt4.detailsofqtrainer();
					System.out.println("************************");
				   if(a!=null)
				   {

				   }
			       
                    //c1.t1.qs2.qt5.detailsofqtrainer();
				break;}
			case 5:{System.out.println("\t\t\tDetails of Jspider trainers\t\t\t");
			        Jtrainer jt1=new Jtrainer("Tabrez","java",9875644321l);
				    jt1.detailsofjtrainer();
					System.out.println("************************");
					Jtrainer jt2=new Jtrainer("sambhu","Advance java",9995646327l);
					jt2.detailsofjtrainer();
					System.out.println("************************");
					Jtrainer jt3=new Jtrainer("kiran","java script",859564432l);
					jt3.detailsofjtrainer();
					System.out.println("************************");
					Jtrainer jt4=new Jtrainer("sathya","webtech",985676443l);
					jt4.detailsofjtrainer();
					 System.out.println("0.Go back");
		           int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}
			
			case 6:{System.out.println("\t\t\tAdd new trainers details\t\t\t");
			         System.out.println("1.Add in Testing\n2.Add in Development");
			         int new_trainer=s.nextInt();
					 if (new_trainer==1)
					 {
						 a="not null";
						 returnvalues();
					 }
					 else if(new_trainer==2)
					 {
                        
					 }

			         System.out.println("0.Go back");
					  int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 7:{System.out.println("\t\t\tRemove the old trainers details\t\t\t");
			         System.out.println("0.Go back");
					  int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 8:{System.out.println("\t\t\tAdd new Qspider branch details\t\t\t");
			         System.out.println("0.Go back");
					  int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 9:{System.out.println("\t\t\tRemove old Qspider branch details\t\t\t");
			        
				break;}

			case 10:{System.out.println("\t\t\tAdd new Jspider branch details\t\t\t");
			         System.out.println("0.Go back");
					  int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 11:{System.out.println("\t\t\tRemove old Qspider branch details\t\t\t");
			         System.out.println("0.Go back");
					  int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 12:{

				System.out.println("\t\t\t1.Is Testing present in Qspider?\n\t\t\t \t\t\t2.Is Testing present in Jspider?\t\t\t");
				int input4=s.nextInt();
			         if (input4==1)
			         {
						 System.out.println("Yes,Testing present in a Qspider.");
			         }
					 else if (input4==2)
				     {
						 System.out.println("No,Testing is not present in a Jspider.");
				     }
					  System.out.println("0.Go back");
					   int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 13:{System.out.println("1.Is Development present in Qspider?\n2.Is Development present in Jspider");
			         int input5=s.nextInt();
			         if (input5==1)
			         {
						 System.out.println("No,Development is not present in a Qspider.");
			         }
					 else if (input5==2)
				     {
						 System.out.println("No,Development present in a Jspider");
				     }
					  System.out.println("0.Go back");
					   int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}

			case 14:{System.out.println("\t\t\tDetails about subjects presented in Qspider\t\t\t");
			          c1.t1.detailsofqsubjects();
					   System.out.println("0.Go back");
					    int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 }
				break;}
                        
			case 15:{System.out.println("\t\t\tDetails about subject presented in Jspider\t\t\t");
			            d1.detailsofjsubjects();
					    System.out.println("0.Go back");
						 int go_back=s.nextInt();
			 if (go_back==0)
			 {
                  input();
			 } 
				break;}

			case 16:{b=false;
				break;}
			
			}
		}while (b);   
	}

	public static void input()
	{
		System.out.println("Select the input");
		System.out.println("1.Details of CEO\n2.Details of Qspider branches\n3.Details of Jspider branches\n4.Details of Qspider trainers\n5.Details of Jspider trainer\n6.add trainer\n7.Remove trainers\n8.Add Qspider branches\n9.Remove Qspider branches\n10.Add Jspider branches\n11.Remove Jspider branches\n12.Is testing present\n13.Is development present\n14.Details of qspider trainers skill\n15.Details of Jspiders trainers skills\n16.Exit");
	}

	public static void returnvalues()
    {
		 System.out.println("Enter name of the trainer");
		 String qtrainer_name=s.nextLine();
		System.out.println("Enter the contact of the trainer");
	     long qcontact=s.nextLong();
		 System.out.println("Enter the skills of the trainer");
		 String qskill=s.nextLine();
		 
         Qtrainer qt5=new Qtrainer(qtrainer_name,qskill,qcontact);
         qt5.detailsofqtrainer();

    }
}