import java.util.ArrayList;

public class SoccerTeam extends Team {
      private ArrayList<String> teamMembers;

      // constructor
      public SoccerTeam(String teamName ) {
            super(teamName);
            this.teamMembers = new ArrayList<>();
      }

      public void addTeamMember(String name) {
            this.teamMembers.add(name);
      }

      public String toString() {
            return super.toString() + this.teamMembers;
      }
}

