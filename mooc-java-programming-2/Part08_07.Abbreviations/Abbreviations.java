import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrevMap;

    // constructor
    public Abbreviations() {
        this.abbrevMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbrevMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbrevMap.get(abbreviation) == null) {
            return false;
        }
        return true;
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbrevMap.get(abbreviation);
    }
}

