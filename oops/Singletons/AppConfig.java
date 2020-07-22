package oops.Singletons;

public class AppConfig {
//step 1 :restricting creation of multiple objects from another class
	private AppConfig() {
		
	}
	// creating first and the last instance of this class
	private static AppConfig obj = null;
	
			//lazy method
	public static AppConfig getInstance() {
		if(obj == null)
			obj =new  AppConfig();
		return obj;
	}
	

}
// Singleton Pattern : is mostly used in multi-threaded and dataBase application 
//it is used in logging,caching,thread pools,configuration setting etc

// prevent mutliple time of disk access in apps (which is too time consuming)
// hence inc speed of the app