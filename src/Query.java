import java.util.Collection;

public abstract class Query {

	public static Collection<Person> invoke(StoredProcedure storedProcedure) {
		System.out.println("Invoking the saved Query...");
		return null;
	}

}
