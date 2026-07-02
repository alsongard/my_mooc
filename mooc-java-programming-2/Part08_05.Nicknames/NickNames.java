
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> randomNames = new HashMap<>();
        randomNames.put("mathew's", "matt");
        randomNames.put("michael's", "mix");
        randomNames.put("arthur's", "artie");

        System.out.println(randomNames.get("mathew's"));
    }

}

