import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		Config<Person> classConfig = ConfigFactory.getClassConfig(Person.class);
		final StoredProcedure storedProcedure = StoredProcedure.getPeopleByUserName;

		// Make sure to map the PersonId column
		// to the Id field in class Person.

		// Make separate SQL queries to fetch
		// Address type objects that are related
		// to each Person object through the
		// AddressId key.
		classConfig.configure(storedProcedure).by(c -> c.usingClassNameId()).and(c -> c.fetchRelatedObjects());

		// Given the configuration
		// information above, we can
		// execute a query to obtain
		// a set of Person objects.
		classConfig.summary();
		Collection<Person> people = Query.invoke(storedProcedure);
		System.out.println("Beaten the typechecker!");
	}

}
