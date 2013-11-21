package bf4jsonmapping;

import java.util.ArrayList;

public class BfTeam {

	private ArrayList<Bf4Player> playerlist;
	private String ticketcount;
	
	
	public String getTicketcount() {
		return ticketcount;
	}
	public void setTicketcount(String ticketcount) {
		this.ticketcount = ticketcount;
	}
	public ArrayList<Bf4Player> getPlayerlist() {
		return playerlist;
	}
	public void setPlayerlist(ArrayList<Bf4Player> playerlist) {
		this.playerlist = playerlist;
	}
	
}
