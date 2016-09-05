import java.util.Collection;

public abstract class Query {
	public static <T> Collection<T> invoke(StoredProcedure storedProcedure) {
		System.out.println("Invoking the Query: " + storedProcedure.toString());
		System.out.println("With the following Config:");
		SharedQueryConfingState.getInstance().getCurrentState().summary();
		;

		return null;
	}
}
