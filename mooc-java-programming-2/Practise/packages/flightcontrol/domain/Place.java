package flightcontrol.domain;

public class Place {
	private String ID;


	public Place(String Id)  {
		this.ID =  Id;
	}

	@Override
	public String toString() {
		return this.ID;
	}
	
}