class Showroom 
{   
	static String showroom_name="SR motors";
	String manager_name;
	int square_feet;
	String branch;
	car c;
	Bike b;

	public Showroom()
	{
		
	}

	public Showroom(String m_name,int sq_feet,String place,car c,Bike b)
	{
		manager_name=m_name;
		square_feet=sq_feet;
		branch=place;
		this.c=c;
		this.b=b;
	}

	//public Bike(String m_name,int sq_feet,String place,Bike b)
	//{
		//manager_name=m_name;
		//square_feet=sq_feet;
		//branch=place;
		//this.b=b;
	//S}

	public void detailsofshowroom()
	{
		System.out.println("the showroom name is :" +showroom_name);
		System.out.println("the manager name is :" +manager_name);
	    System.out.println("the total square feet is :" +square_feet);
		System.out.println("the branch name is :" +branch);
		System.out.println("\t\t******************************\t\t");
	}
}
