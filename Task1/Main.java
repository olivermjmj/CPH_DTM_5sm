import java.util.ArrayList;

//1.a
public class Main {

    ArrayList<Team> teamPlayerNames = new ArrayList<>();

    public static void main(String[] args) {

        //1.g
        Team teamA = new Team("Gifflar"); 

        //1.i
        teamA.setRank(6);

        //1.j
        System.out.println(teamA);

        //1.k
        Team teamA = new Team("Gifflar"); 


        Team team1 = new Team("Gifflar1");
        addPlayer("Pebbernuts");
        addPlayer("3mp1r3");
        addPlayer("earbuds");
        addPlayer("Fallen moon");
        addPlayer("Redish ragons");

        Team team2 = new Team("Gifflar2"); 
        Team team3 = new Team("Gifflar3"); 
        Team team4 = new Team("Gifflar4"); 
        Team team5 = new Team("Gifflar5");

       for (Team playerName: teamPlayerNames) {

       	System.out.println(playerName);
       }
    }

    public static void addPlayer(String extraTeamPlayer) {

        Team newTeam = new Team(extraTeamPlayer);
        teamPlayerNames.add(newTeam);
    }
}