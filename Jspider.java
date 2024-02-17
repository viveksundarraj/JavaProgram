class Jspider 
{
	 String jbranch;
	 String jmanager_name;
	 int jno_of_stnds;

	 Jtrainer jt1;
	 Jtrainer jt2;
	 Jtrainer jt3;
	 Jtrainer jt4;

	 Jspider(String jbran,String jmgr_name,int jnos)
	{
		  jbranch=jbran;
	      jmanager_name=jmgr_name;
	      jno_of_stnds=jnos;
	}

	public void detailsofjspider()
	{
		System.out.println("branch :" +jbranch);
		System.out.println("location :" +jno_of_stnds);
		System.out.println("Branch manager name :" +jmanager_name);
    }
}
 