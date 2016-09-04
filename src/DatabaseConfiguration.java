import java.util.ArrayList;
import java.util.function.Function;

public abstract class DatabaseConfiguration {
	protected Function<DatabaseSeperation, Object> byProterty = null;
	protected ArrayList<Function<DatabaseAction, Object>> andActions = new ArrayList<>();
	protected StoredProcedure procedure;

	abstract DatabaseConfiguration configure(StoredProcedure storedProcedure);

	abstract <T> DatabaseConfiguration by(Function<DatabaseSeperation, Object> f);

	abstract <T> DatabaseConfiguration and(Function<DatabaseAction, Object> f);

	abstract void summary();
}
