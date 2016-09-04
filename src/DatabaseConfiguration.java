import java.util.function.Function;

public interface DatabaseConfiguration {
	DatabaseConfiguration configure(StoredProcedure storedProcedure);

	<T> DatabaseConfiguration by(Function<DatabaseSeperation, Object> f);

	<T> DatabaseConfiguration and(Function<DatabaseAction, Object> f);

	void summary();
}
