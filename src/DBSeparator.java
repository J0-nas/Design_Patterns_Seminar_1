public interface DBSeparator {
	default Object usingClassNameId() {
		System.out.println("using ClassNameId...");
		return null;
	}
}
