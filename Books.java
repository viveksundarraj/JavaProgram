class Books extends Author
{
    String name;
	double price;

	public Books(String author_name,int age,String place,String name,double price)
	{
		this.author_name=author_name;
		this.age=age;
		this.place=place;
		this.name=name;
		this.price=price;
	}
	
	public void bookdetails()
	{
		System.out.println("the name of the book is:" +name);
		System.out.println("the price of the book is:" +price);
		System.out.println("the name of the author is:" +author_name);
		System.out.println("the age of the author is:" +age);
		System.out.println("the place of the author is:" +place);

	}
}
