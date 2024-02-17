class Ceo
{
	static String ceo_name;
	static long ceo_contact;
	static String ceo_native;
	static String ceo_qualification;

	Testing t1=new Testing("celenium","manual testing","Automation","fire flink");

	public Ceo(String ceo_name,long ceo_contact,String ceo_native,String ceo_qualification)
	{
		this.ceo_name=ceo_name;
		this.ceo_contact=ceo_contact;
		this.ceo_native=ceo_native;
		this.ceo_qualification=ceo_qualification;
	}

	public static void detailsofceo();
	{
		System.out.println("Name of the ceo is" + ceo_name);
		System.out.println("the contact number of ceo is" + ceo_contact);
		System.out.println("Native of the ceo is" + ceo_native);
		System.out.println("Qualification of the ceo is" + ceo_qualification);
	}
}
