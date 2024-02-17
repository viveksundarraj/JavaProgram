import java.util.Scanner;
class Mobile 
{
	static Scanner s=new Scanner(System.in);
	String brand;
	String model_no;
	String color;
	String display;
	String operating_system;

	sim slot1;
	sim slot2;

	Mobile(String b,String mno,String col,String dply,String os)
	{
		 brand=b;
		 model_no=mno;
		 color=col;
		 display=dply;
		 operating_system=os;
	}
    
	public void insertsim1(sim sim1)
	{
		if (slot1==null)
		{
			slot1=sim1;
			System.out.println("sim-1 inserted successfully");
		}
		else
		{
			System.out.println("sim-1 is already inserted");
		}
    }

	public void insertsim2(sim sim2)
	{
		if (slot2==null)
		{
			slot2=sim2;
			System.out.println("sim-2 is inserted successfully");
		}
		else
		{
			System.out.println("sim-2 is already inserted");
		}
	}

	public void removesim1()
	{
		if (slot1!=null)
		{
			slot1=null;
			System.out.println("sim-1 is removed successfully");
		}
		else
	    {
			System.out.println("sim-2 is not inserted,so insert first");
	    }
	}

	public void removesim2()
	{
		if (slot2!=null)
		{
			slot2=null;
			System.out.println("sim-2 is removed successfully");
		}
		else
		{
			System.out.println("sim-1 is not inserted,so insert first" );
		}
	}

	public void detailsofmobile()
	{
		System.out.println("mobile brand:" +brand);
		System.out.println("mobile brand:" +model_no);
		System.out.println("mobile brand:" +color);
		System.out.println("mobile brand:" +display);
		System.out.println("mobile brand:" +operating_system);
	}

	public void detailsofsims()
	{
	    System.out.println("select the slot");
	    System.out.println("1.slot-1\n 2.slot-2");
		int input2=s.nextInt();
	if (input2==1)
	{
	if (slot1!=null)
	{
		System.out.println("Name:" +slot1.sim_name);
		System.out.println("Band:" +slot1.band);
		System.out.println("current Recharge plan:" +slot1.recharge);
	}
	else
	{
		System.out.println("plz insert the sim first");
	}
	}
	else
	{
    if (slot2!=null)
	{
        System.out.println("Name:" +slot2.sim_name);
		System.out.println("Band:" +slot2.band);
		System.out.println("current Recharge plan:" +slot2.recharge);
	}
    else
	{
		System.out.println("plz insert the sim first");
	}
	}
	}
	public void issimpresent()
	{
     if (slot1!=null)
     {
		 System.out.println("sim1 is present");
     }
	 else
	{
		System.out.println("sim1 is not present");
	}

	if (slot2!=null)
	{
         System.out.println("sim2 is present");
	}
	else
	{
		System.out.println("plz insert the sim first");
	}
	}
}
