class Qspider 
{
     String qbranch;
	 String qmanager_name;
	 int qno_of_stnds;

     Qtrainer qt1=new Qtrainer("sambhu","celenium",9876543210l);
	 Qtrainer qt2=new Qtrainer("keerthi","manual testing",8876543210l);
	 Qtrainer qt3=new Qtrainer("bharath","automation",7876543210l);
	 Qtrainer qt4=new Qtrainer("kiran","fire flink",6876543210l);

	 Qspider(String qbran,String qmgr_name,int qnos)
	{
		  qbranch=qbran;
	      qmanager_name=qmgr_name;
	      qno_of_stnds=qnos;
	}

	public void detailsofqspider()
	{
		System.out.println("branch :" +qbranch);
		System.out.println("location :" +qno_of_stnds);
		System.out.println("branch :" +qmanager_name);
	}
}
