class FaceBook{
float version;
String leadDeveloper;
string releaseDate;

FaceBook(float newVersion){
	version=newVersion;
	System.out.println("invoked version constructor");
}
FaceBook(String newLeadDeveloper){
	leadDeveloper=newLeadDeveloper;
	System.out.println("invoked leadDeveloper constructor");
}
FaceBook(int newReleaseDate){
	releaseDate=newReleaseDate;
	System.out.println("invoked releaseDate constructor");
}
FaceBook(float newVersion ,String Developer){
System.out.println("invoked version leaddeveloper constructor");	
version=newVersion;
leadDeveloper=Developer;
}

FaceBook(float newVersion ,String Developer, int Released){
System.out.println("invoked version leadDeveloper releaseDate constructor");	
version=newVersion;
leadDeveloper=Developer;
releaseDate=Released;
}

FaceBook(float newVersion ,int Released ){
System.out.println("invoked version releaseDate constructor");	
version=newVersion;
releaseDate=Released;
}

FaceBook(String Developer, int Released){
System.out.println("invoked leadDeveloper releaseDate constructor");	
leadDeveloper=Developer;
releaseDate=Released;
}

}