package bf4xmlMapping.cheatcheck;

public class Weapons {

	private String DPS;
	private String HKR;
	private String HKP;
	private String ACC;
	private String kills;
	private String headshots;
	private String shot;
	private String hit;
	private CheatStatus cheatStatus;
	private String weaponName;
	
	
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getDPS() {
		return DPS;
	}
	public void setDPS(String dPS) {
		DPS = dPS;
	}
	public String getHKR() {
		return HKR;
	}
	public void setHKR(String hKR) {
		HKR = hKR;
	}
	public String getHKP() {
		return HKP;
	}
	public void setHKP(String hKP) {
		HKP = hKP;
	}
	public String getACC() {
		return ACC;
	}
	public void setACC(String aCC) {
		ACC = aCC;
	}
	public String getKills() {
		return kills;
	}
	public void setKills(String kills) {
		this.kills = kills;
	}
	public String getHeadshots() {
		return headshots;
	}
	public void setHeadshots(String headshots) {
		this.headshots = headshots;
	}
	public String getShot() {
		return shot;
	}
	public void setShot(String shot) {
		this.shot = shot;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public CheatStatus getCheatStatus() {
		return cheatStatus;
	}
	public void setCheatStatus(CheatStatus cheatStatus) {
		this.cheatStatus = cheatStatus;
	}
	
}
