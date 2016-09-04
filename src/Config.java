import java.util.ArrayList;
import java.util.function.Function;

public class Config<T> implements DatabaseConfiguration {
	private Function<DatabaseSeperation, Object> byProterty = null;
	private ArrayList<Function<DatabaseAction, Object>> andActions = new ArrayList<>();
	private StoredProcedure procedure;

	public Config<T> configure(StoredProcedure storedProcedure) {
		System.out.println("Config - Stored: " + storedProcedure);
		this.procedure = storedProcedure;
		SharedQueryConfingState.getInstance();
		SharedQueryConfingState.setConfig(this);
		return this;
	}

	public <U> Config<T> by(Function<DatabaseSeperation, Object> f) {
		System.out.println("Config - Setting classifyer..");
		this.byProterty = f;
		return this;
	}

	public <W> Config<T> and(Function<DatabaseAction, Object> f) {
		System.out.println("Config - Adding additional action...");
		this.andActions.add(f);
		return this;
	}

	public void summary() {
		System.out.println("This config stores: " + procedure.toString() + " - byProperty: " + byProterty.toString()
				+ " - additional actions: " + andActions);
	}
}
