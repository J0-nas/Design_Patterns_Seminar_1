import java.util.Collection;
import java.util.function.Function;

public interface DatabaseConfiguration {
	DatabaseConfiguration configure(StoredProcedure storedProcedure);

	<T> DatabaseConfiguration by(Function<DatabaseConfiguration, T> f);

	<T> DatabaseConfiguration and(Function<DatabaseConfiguration, T> f);

	<T> T usingClassNameId();

	Collection<Object> fetchRelatedObjects();
}
