class Bike 
{
	String bike_name;
	String bike_color;
    double bike_price;
	Bike_Engine be;

	public Bike()
	{
		
	}

	public Bike(String b_name,String b_color,double b_price,Bike_Engine be)
	{
		bike_name=b_name;
		bike_color=b_color;
		bike_price=b_price;
		this.be=be;
	}

	public void detailsofbike()
	{
		System.out.println("The name of the bike is:" +bike_name);
		System.out.println("The color of the bike is:" +bike_name);
		System.out.println("The price of the bike is:" +bike_name);
		System.out.println("/t/t****************************/t/t");
	}
}
