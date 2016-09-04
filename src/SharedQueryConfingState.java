
public class SharedQueryConfingState {
	private static SharedQueryConfingState instance;
	private static AdjustableConfig config = null;

	private SharedQueryConfingState() {

	}

	public static SharedQueryConfingState getInstance() {
		if (instance == null) {
			instance = new SharedQueryConfingState();
		}
		return instance;
	}

	public static void setConfig(AdjustableConfig c) {
		config = c;
	}

	public AdjustableConfig getCurrentState() {
		return config;
	}
}
