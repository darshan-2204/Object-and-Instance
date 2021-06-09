class FaceBookTester{
public static void main(String[] args)
{
FaceBook vers=new FaceBook(3.4f);
System.out.println("Version:"+vers.version);

FaceBook lead=new FaceBook("Darshan");
System.out.println("LeadDeveloper:"+lead.leadDeveloper);

FaceBook date=new FaceBook(2008);
System.out.println("ReleaseDate:"+date.releaseDate);

FaceBook dev1=new FaceBook(5.1f,"Mark Zuckerberg");
System.out.println("version : " + dev1.version);
System.out.println("Developer : " + dev1.leadDeveloper);

FaceBook dev2=new FaceBook(5.4f,"Mark Zuckerberg",2009);
System.out.println("version : " + dev2.version);
System.out.println("Developer : " + dev2.leadDeveloper);
System.out.println("ReleaseDate : " + dev2.releaseDate);

FaceBook dev3=new FaceBook(5.10f,2011);
System.out.println("version  :" + dev3.version);
System.out.println("ReleaseDate : " + dev3.releaseDate);

FaceBook dev4=new FaceBook("Mark Zuckerberg",2015);
System.out.println("Developer : " + dev4.leadDeveloper);
System.out.println("ReleaseDate : " + dev4.releaseDate);


}

}
