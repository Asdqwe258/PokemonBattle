public class Pokemon{
	double health;
	private int atk;
	private int spatk;
	private int def;
	private int spdef;
	private int speed;
	private int type;
	public Pokemon(double a, int b, int c, int d, int e, int f, int g) {
		health = a;
		atk = b;
		spatk = c;
		def = d;
		spdef = e;
		speed = f;
		type = g;
	}
	public void atk(Pokemon a, Pokemon b){
		health = b.getHealth() - (11/25)*(a.getAtk()/b.getDef()) + 2;
	}
	public void spAtk(Pokemon a,Pokemon b){
		health = b.getHealth() - (11/25)*(a.getSpAtk()/b.getSpDef()) + 2;

	}
	public double getHealth(){
		return health;
	}
	public int getAtk(){
		return atk;
	}
	public int getSpAtk(){
		return spatk;
	}
	public int getDef(){
		return def;
	}
	public int getSpDef(){
		return spdef;
	}
	public int getSpeed(){
		return speed;
	}
	public int getType(){
		return type;
	}
	public String toString(){
		return ("Health: " + health + "\nAttack: " + atk + "\nSpecial Attack: " + "\nDefense: " + def + "\nSpecial Defense: " + spdef + "\nSpeed: " + speed);
	}
	
}
