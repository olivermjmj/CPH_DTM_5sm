//1.b
public class Team {

	//1.c
	private String teamName;

	//1.d
	private int teamRank;

	//1.e
	private String teamMembers;

	//1.f
	public Team(String tmpTeamName) {

		teamName = tmpTeamName;
	}

	//1.h
	public void setRank(int tmpTeamRank) {

		teamRank = tmpTeamRank;
	}

	public String getTeamName() {

		return teamName;
	}

	public int getTeamRank() {

		return teamRank;
	}

	public String getTeamMembers() {

		return teamMembers;
	}

	//1.j
	@Override
	public String toString() {

		return "Hold: " + getTeamName() + " teamMembers: " + getTeamMembers() + " Rang: " + getTeamRank();
	}


	
}