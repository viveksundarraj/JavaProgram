class car 
{
	String car_name;
	String car_color;
    double car_price;
	car_Engine ce;

	public car()
	{
		
	}

	public car(String c_name,String c_color,double c_price,car_Engine ce)
	{
		car_name=c_name;
		car_color=c_color;
		car_price=c_price;
		this.ce=ce;
	}

	public void detailsofcar()
	{
		System.out.println("The name of the car is:" +car_name);
		System.out.println("The color of the car is:" +car_name);
		System.out.println("The price of the car is:" +car_name);
		System.out.println("/t/t****************************/t/t");
	}
}
