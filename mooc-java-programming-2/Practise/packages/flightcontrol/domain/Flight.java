package flightcontrol.domain;

public class Flight {
	private Airplane airplane;
	private Place departureAirport;
	private Place targetAirport;

	public Flight(Airplane airplane, Place departure, Place target) {
		this.airplane = airplane;
		this.departureAirport = departure;
		this.targetAirport = target;
	}

	public Airplane getAirplane(){
		return this.airplane;
	}

	public Place getDeparturPlace() {
		return this.departureAirport;
	}

	public Place getTargetAirPlace() {
		return this.targetAirport;
	}

	@Override
	public String toString() {
		return this.airplane.toString() + " (" + this.departureAirport + " - " + this.targetAirport + ")";
	}
}