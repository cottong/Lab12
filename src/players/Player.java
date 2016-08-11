package players;

public abstract class Player {

	private String name;
	private String roshamboValue;

	public String getRoshamboValue() {
		return roshamboValue;
	}

	public void setRoshamboValue(String roshamboValue) {
		this.roshamboValue = roshamboValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String generateRoshambo();

}
