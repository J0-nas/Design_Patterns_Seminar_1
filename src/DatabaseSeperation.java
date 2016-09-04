public interface DatabaseSeperation {
	default Object usingClassNameId() {
		System.out.println("using ClassNameId...");
		return null;
	}
}
