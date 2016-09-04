import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class Config<T> implements DatabaseConfiguration {
	private Function<DatabaseConfiguration, Object> byProterty = null;
	private ArrayList<Function<DatabaseConfiguration, Object>> andActions = new ArrayList<>();
	private StoredProcedure procedure;

	public Config<T> configure(StoredProcedure storedProcedure) {
		System.out.println("Config - Stored: " + storedProcedure);
		this.procedure = storedProcedure;
		return this;
	}

	public <U> Config<T> by(Function<DatabaseConfiguration, U> f) {
		System.out.println("Config - Setting classifyer..");
		this.byProterty = (Function<DatabaseConfiguration, Object>) f;
		return this;
	}

	public <T> T usingClassNameId() {
		System.out.println("...usingClassName");
		return null;
	}

	public <W> Config<T> and(Function<DatabaseConfiguration, W> f) {
		System.out.println("Config - Adding additional action...");
		this.andActions.add((Function<DatabaseConfiguration, Object>) f);
		return this;
	}

	public Collection<Object> fetchRelatedObjects() {
		System.out.println("...fetchRelatedObjects");
		return null;
	}

	public void summary() {
		System.out.println("This config stores: " + procedure.toString() + " - byProperty: " + byProterty.toString()
				+ " - additional actions: " + andActions);
	}
}
