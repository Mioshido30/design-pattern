package proxy.protection;

public class DatabaseProxy implements IExecutable {

	private boolean isAdmin = false;
	private DatabaseManager db = null;

	public DatabaseProxy(User user) {
		this.isAdmin = (user.getRole() == "admin")? true : false;
		this.db = new DatabaseManager();
	}
	
	@Override
	public void executeQuery(String query) {
		if(isAdmin) {
			db.executeQuery(query);
		} else if(query.contains("select")){
			db.executeQuery(query);
		} else {
			System.out.println("Action restricted! User are not authorized.");
		}
	
	}

}
