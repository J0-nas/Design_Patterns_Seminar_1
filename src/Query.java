import java.util.Collection;

public abstract class Query {
	public static <T> Collection<T> invoke(StoredProcedure storedProcedure) {
		System.out.println("Invoking the saved Query...");
		System.out.println("With the following config:");
		SharedQueryConfingState.getInstance().getCurrentState().summary();
		;

		return null;
	}

}
