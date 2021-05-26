package zaverecnaPrace;

public class Hrac {

	private String jmeno;
	private int hp;
	private int damage;
	private int luck;
	private boolean maGadget;
	
	public Hrac(String jmeno, int hp, int damage, int luck, boolean maGadget) {
		super();
		this.jmeno = jmeno;
		this.hp = hp;
		this.damage = damage;
		this.luck = luck;
		this.maGadget = maGadget;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public boolean isMaGadget() {
		return maGadget;
	}

	public void setMaGadget(boolean maGadget) {
		this.maGadget = maGadget;
	}

	@Override
	public String toString() {
		return "Hrac [jmeno=" + jmeno + ", hp=" + hp + ", damage=" + damage + ", luck=" + luck + ", maGadget="
				+ maGadget + "]";
	}
	
	
	
}
