import java.util.Scanner;
class Qtrainer 
{
	 String qtrainer_name;
	 String qskill;
	 long qcontact;
     static Scanner s=new Scanner(System.in);

	 Qtrainer(String qtrainer_name,String qskill,long qcontact)
	 {
		this.qtrainer_name=qtrainer_name;
		this.qskill=qskill;
		this.qcontact=qcontact;
	 }

	 public void detailsofqtrainer()
	 {
		System.out.println("the name of the trainer is " +qtrainer_name);
		System.out.println("the skills of the trainer is " +qskill);
		System.out.println("the contact of the trainer is " +qcontact);	
	 }

}
