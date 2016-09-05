import java.util.function.Function;

public class Config<T> extends AdjustableConfig {

	public Config<T> configure(StoredProcedure storedProcedure) {
		System.out.println("Config - Stored: " + storedProcedure);
		this.procedure = storedProcedure;
		SharedQueryConfingState.getInstance();
		SharedQueryConfingState.setConfig(this);
		return this;
	}

	public <U> Config<T> by(Function<DBSeparator, Object> f) {
		System.out.println("Config - Setting <by> classifyer... " + f);
		this.bySeperator.add(f);
		return this;
	}

	public <W> Config<T> and(Function<DBAction, Object> f) {
		System.out.println("Config - Adding additional action... " + f);
		this.andActions.add(f);
		return this;
	}

	public void summary() {
		System.out.println("procedure: " + procedure.toString() + " - by: " + bySeperator.toString()
				+ " - and actions: " + andActions);
	}
}
