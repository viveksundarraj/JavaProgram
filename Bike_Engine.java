class Bike_Engine 
{
	
	String bike_type;
	int bike_cc;
	int bike_valve;
	int bike_top_speed;

	public Bike_Engine()
	{
		
	}

	public Bike_Engine(String type,int cc,int valve,int top_speed)
	{
	   	bike_type=type;
		bike_cc=cc;
		bike_valve=valve;
		bike_top_speed=top_speed;
	}

	public void detailsofEngine()
	{
		System.out.println("the type of the bike Engine is:" +bike_type);
		System.out.println("the cc of the bike Engine is:" +bike_cc);
		System.out.println("No of valves in bike Engine is:" +bike_valve);
		System.out.println("the top speed of the bike is:" +bike_top_speed);
		System.out.println("*******************************");
	}
}
