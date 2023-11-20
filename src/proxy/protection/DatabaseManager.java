package proxy.protection;

public class DatabaseManager implements IExecutable {


	@Override
	public void executeQuery(String query) {
		System.out.println("Execute Query: " + query);
	}

}
