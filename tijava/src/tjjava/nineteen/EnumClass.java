package tjjava.nineteen;

public class EnumClass {
	public static void main(String[] args) {
		for (Shrubbery s : Shrubbery.values()) {
			System.out.println(s + "ordinal: " + s.ordinal());
			System.out.println(s.compareTo(Shrubbery.CRAWLING));
			System.out.println(s.equals(Shrubbery.GROUND));
			System.out.println(s == Shrubbery.CRAWLING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("---------------------------------");

		}

		for (String s : "GROUND CRAWLING HANGING".split(" ")) {
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
			System.out.println(shrub);
		}
	}
}

enum Shrubbery {
	GROUND("gg"), CRAWLING("ff"), HANGING("dddd");
	private String description;

	private Shrubbery(String description) {
		this.description = description;
	}


	public String getDescription() {
		return description;
	}

}