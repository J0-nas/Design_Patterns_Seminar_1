import java.util.Collection;

public interface DatabaseAction {
	default <T> Collection<T> fetchRelatedObjects() {
		System.out.println("Fetch related Objects...");
		return null;
	}
}
