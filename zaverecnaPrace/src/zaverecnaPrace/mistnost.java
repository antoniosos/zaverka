package zaverecnaPrace;

public class mistnost {

	private String jmeno;
	private boolean pritomnostEnemy;
	private boolean pritomnostGadget;
	private boolean pritomnostHrac;
	
	public mistnost(String jmeno, boolean pritomnostEnemy, boolean pritomnostGadget, boolean pritomnostHrac) {
		super();
		this.jmeno = jmeno;
		this.pritomnostEnemy = pritomnostEnemy;
		this.pritomnostGadget = pritomnostGadget;
		this.pritomnostHrac = pritomnostHrac;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public boolean isPritomnostEnemy() {
		return pritomnostEnemy;
	}

	public void setPritomnostEnemy(boolean pritomnostEnemy) {
		this.pritomnostEnemy = pritomnostEnemy;
	}

	public boolean isPritomnostGadget() {
		return pritomnostGadget;
	}

	public void setPritomnostGadget(boolean pritomnostGadget) {
		this.pritomnostGadget = pritomnostGadget;
	}

	public boolean isPritomnostHrac() {
		return pritomnostHrac;
	}

	public void setPritomnostHrac(boolean pritomnostHrac) {
		this.pritomnostHrac = pritomnostHrac;
	}

	@Override
	public String toString() {
		return "mistnost [jmeno=" + jmeno + ", pritomnostEnemy=" + pritomnostEnemy + ", pritomnostGadget="
				+ pritomnostGadget + "]";
	}
	
	
}
