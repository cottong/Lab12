package players;

public class RockPlayer extends Player {

	public RockPlayer(){
		setName("State");
		setRoshamboValue("Rock");
	}
	
	@Override
	public String generateRoshambo() {
		// TODO Auto-generated method stub
		return getRoshamboValue();
	}

}
