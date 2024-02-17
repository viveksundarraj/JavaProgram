class Jtrainer
{
	 String jtrainer_name;
	 String jskill;
	 long jcontact;

	 Jtrainer(String jtrainer_name,String jskill,long jcontact)
	 {
		this.jtrainer_name=jtrainer_name;
		this.jskill=jskill;
		this.jcontact=jcontact;
	 }

	 public void detailsofjtrainer()
	 {
		System.out.println("the name of the trainer is " +jtrainer_name);
		System.out.println("the skills of the trainer is " +jskill);
		System.out.println("the contact of the trainer is " +jcontact);	
	 }
}