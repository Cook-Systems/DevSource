package bf4jsonmapping;

import java.util.HashMap;

public class Serverinfo {
	
	private String servertype = "";
	private String servername = "";
	private Integer currentplayers = 0;
	private Integer maxplayers = 0;
	private String round = "";
	private String uptime = "";
	private HashMap<String,String> map = null;
	
	
	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public Integer getCurrentplayers() {
		return currentplayers;
	}

	public void setCurrentplayers(Integer currentplayers) {
		this.currentplayers = currentplayers;
	}

	public Integer getMaxplayers() {
		return maxplayers;
	}

	public void setMaxplayers(Integer maxplayers) {
		this.maxplayers = maxplayers;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getServertype() {
		return servertype;
	}

	public void setServertype(String servertype) {
		this.servertype = servertype;
	}

	public HashMap<String,String> getMap() {
		return map;
	}

	public void setMap(HashMap<String,String> map) {
		this.map = map;
	}


}
