
public class SharedQueryConfingState {
	private static SharedQueryConfingState instance;
	private static DatabaseConfiguration config = null;

	private SharedQueryConfingState() {

	}

	public static SharedQueryConfingState getInstance() {
		if (instance == null) {
			instance = new SharedQueryConfingState();
		}
		return instance;
	}

	public static void setConfig(DatabaseConfiguration c) {
		config = c;
	}

	public DatabaseConfiguration getCurrentState() {
		return config;
	}
}
