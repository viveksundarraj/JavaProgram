class Mobiles 
{
     String ram;
	 double prices;

	smartwatch s;

	public Mobiles(String ram,double prices)
	{
		this.ram=ram;
		this.prices=prices;
	}
    
	public void connectwatch(smartwatch s)
	{
		if (this.s==null)
		{
			this.s=s;
			System.out.println("watch is connected");
			System.out.println("*************************");
		}
		else
		{
			System.out.println("Watch is already connected");
			System.out.println("*************************");
		}
	}
	public void disconnectwatch()
	{
		if(s==null)
		{
			System.out.println("watch is not connected");
			System.out.println("*************************");
		}
		else
		{
			this.s=null;
			System.out.println("watch disconnected successfully");
		}
	}

    public void detailsofwatch()
	{
	  if(s==null)
	  {
		System.out.println("watch is not connected yet");
		System.out.println("plz connect the watch first");
	  }
	  else
	 {
		System.out.println("Brand of the watch is:" +s.brand);
		System.out.println("the color of the watch is:" +s.color);
		System.out.println("the price of the watch is:" +s.price);
	 }
	}

	public void detailsofmobiles()
	{
		
		System.out.println("Ram of the mobile is:" +this.ram);
		System.out.println("the price of the mobile is:" +this.prices);
	

}
