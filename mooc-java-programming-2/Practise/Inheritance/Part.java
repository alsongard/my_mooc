public class Part {

	private String manufacture;
	private String description;
	private String identifier;

	// Constructor
	public Part(String identifier, String manufacturer, String description) {
		this.manufacture = manufacturer;
		this.description = description;
		this.identifier = identifier;
	}

	
	public String getIdentifier() {
		return this.identifier;
	}

	public String getManufacturer() {
		return this.manufacture;
	}

	public String getDescription() {
		return this.description;
	}
}
