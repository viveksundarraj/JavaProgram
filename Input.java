class Input 
{
	public static void main(String[] args) 
	{
		car car1=new car("BMW","Black",1000000,new car_Engine("Diesel",1000,4,300));
		car1.detailsofcar();
		Showroom sr1=new Showroom("manager_name",3000,"vadapalani",new car("BMW","Black",1000000,new car_Engine("Diesel",1000,4,300)));
		sr1.detailsofshowroom();
		sr1.c.detailsofcar();
		sr1.e.detailsofEngine();
	}
}
