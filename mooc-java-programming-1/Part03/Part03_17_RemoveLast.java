
import java.util.ArrayList;

class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> footballTeams  = new ArrayList<>();
        footballTeams.add("Barcelona");
        footballTeams.add("Manchester");
        footballTeams.add("Sevilla");
        footballTeams.add("Mancity");

        System.out.println(footballTeams);

        removeLast(footballTeams);

        System.out.println(footballTeams);

    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1); // remove the last item  using indexing
    }
}

