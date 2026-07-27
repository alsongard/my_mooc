public class Literacy {
	private String theme;
	private String gender;
	private String ageGroup;
	private String country;
	private int year;
	private double literacyPercent;


	// constructor
	public Literacy(String themeName, String ageName, String genderName,  String countryName, int year, double percent) {
		this.theme = themeName;
		String[] newGenger = genderName.trim().split(" ");
		this.gender = newGenger[0];
		this.ageGroup = ageName;
		this.country = countryName;
		this.year = year;
		this.literacyPercent = percent;
	}
	public double getLiteracyPercent() {
		return this.literacyPercent;
	}

	@Override
	public String toString() {
		return this.country + " (" + this.year + "), "  + this.gender + ", " + this.literacyPercent ;
	}
}	

