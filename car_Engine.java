class car_Engine 
{
	String car_type;
	int car_cc;
	int car_valve;
	int car_top_speed;

	public car_Engine()
	{
		
	}

	public car_Engine(String type,int cc,int valve,int top_speed)
	{
	   	car_type=type;
		car_cc=cc;
		car_valve=valve;
		car_top_speed=top_speed;
	}

	public void detailsofEngine()
	{
		System.out.println("the type of the car Engine is:" +car_type);
		System.out.println("the cc of the car Engine is:" +car_cc);
		System.out.println("No of valves in car Engine is:" +car_valve);
		System.out.println("the top speed of the car is:" +car_top_speed);
		System.out.println("*******************************");
	}
}
