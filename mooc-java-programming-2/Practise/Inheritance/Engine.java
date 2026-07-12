public class Engine extends Part {
	private String engineType;


	// default constructor
	public Engine (String engineType, String identifier, String manufacturer, String description) {
		super(identifier, manufacturer, description);// this calls Part() custom constructor
		this.engineType = engineType;
	}


	public String getEngineType() {
		return this.engineType;
	}

}
