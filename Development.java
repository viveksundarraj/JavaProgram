class Development
{
	String jsubject1;
	String jsubject2;
	String jsubject3;
	String jsubject4;

    Jspider js1;
	Jspider js2;
 
	Development(String jsub1,String jsub2,String jsub3,String jsub4)
	{
		 jsubject1=jsub1;
	     jsubject2=jsub2;
	     jsubject3=jsub3;
	     jsubject4=jsub4;
	}

	public void detailsofjsubjects()
	{
		System.out.println("subject in Jspider");
		System.out.println("subject_1:" +jsubject1);
		System.out.println("subject_2:" +jsubject2);
		System.out.println("subject_3:" +jsubject3);
		System.out.println("subject_4:" +jsubject4);

	}
}
