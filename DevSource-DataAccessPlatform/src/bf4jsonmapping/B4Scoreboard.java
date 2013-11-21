package bf4jsonmapping;

import java.util.ArrayList;
import java.util.Deque;

public class B4Scoreboard {
	
	private String status = "";
	private Serverinfo serverinfo = null;
	private String[] adminsonline = null;
	private ArrayList<BfTeam> teaminfo = null;
	private String execuation_time = "";

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Serverinfo getServerinfo() {
		return serverinfo;
	}

	public void setServerinfo(Serverinfo serverinfo) {
		this.serverinfo = serverinfo;
	}

	public String[] getAdminsonline() {
		return adminsonline;
	}

	public void setAdminsonline(String[] adminsonline) {
		this.adminsonline = adminsonline;
	}

	public String getExecuation_time() {
		return execuation_time;
	}

	public void setExecuation_time(String execuation_time) {
		this.execuation_time = execuation_time;
	}

	public ArrayList<BfTeam> getTeaminfo() {
		return teaminfo;
	}

	public void setTeaminfo(ArrayList<BfTeam> teaminfo) {
		this.teaminfo = teaminfo;
	}

}
