class Testing 
{
	String qsubject1;
	String qsubject2;
	String qsubject3;
	String qsubject4;

    Qspider qs1=new Qspider("vadapalani","sambu",999);
	Qspider qs2=new Qspider("bangalore","harsha",899);
 
	Testing(String qsub1,String qsub2,String qsub3,String qsub4)
	{
		 qsubject1=qsub1;
	     qsubject2=qsub2;
	     qsubject3=qsub3;
	     qsubject4=qsub4;
	}

	public void detailsofqsubjects()
	{
		System.out.println("subject in Qspider");
		System.out.println("subject_1:" +qsubject1);
		System.out.println("subject_2:" +qsubject2);
		System.out.println("subject_3:" +qsubject3);
		System.out.println("subject_4:" +qsubject4);

	}
}
