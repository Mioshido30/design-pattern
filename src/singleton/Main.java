package singleton;

public class Main {

	public Main() {
		DatabaseManager db = DatabaseManager.getInstance();
		DatabaseManager db2 = DatabaseManager.getInstance();
	}

	public static void main(String[] args) {
		new Main();
	}

}
