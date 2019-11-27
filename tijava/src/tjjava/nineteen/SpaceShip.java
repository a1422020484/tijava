package tjjava.nineteen;

public enum SpaceShip {
	SCOUT, CARGO, TRANSPORT;

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}

	public static void main(String[] args) {
		for (SpaceShip e : values()) {
			System.out.println(e);
		}
	}
}
