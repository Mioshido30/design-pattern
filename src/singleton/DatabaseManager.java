package singleton;

public class DatabaseManager {

	private static DatabaseManager dbInstance;
	private DatabaseManager() {
		System.out.println("Database Created");
	}
	
	public static DatabaseManager getInstance() {
		
		if(dbInstance == null) {
			synchronized (DatabaseManager.class) {
				if(dbInstance == null) dbInstance = new DatabaseManager();
			}			
		}
		
		System.out.println("Opening Database");		
		return dbInstance;			
	}

}
