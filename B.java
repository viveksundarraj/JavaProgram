class B extends A 
{
	int d=40;
	int e=50;

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.display();
	}

	public void display();
	{
		System.out.println(b1.a); 
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
		System.out.println(b1.e);
	}
}
