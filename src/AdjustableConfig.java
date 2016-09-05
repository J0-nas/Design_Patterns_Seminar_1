import java.util.ArrayList;
import java.util.function.Function;

public abstract class AdjustableConfig {
	protected ArrayList<Function<DBSeparator, Object>> bySeperator = new ArrayList<>();
	protected ArrayList<Function<DBAction, Object>> andActions = new ArrayList<>();
	protected StoredProcedure procedure;

	abstract AdjustableConfig configure(StoredProcedure storedProcedure);

	abstract <T> AdjustableConfig by(Function<DBSeparator, Object> f);

	abstract <T> AdjustableConfig and(Function<DBAction, Object> f);

	abstract void summary();
}
