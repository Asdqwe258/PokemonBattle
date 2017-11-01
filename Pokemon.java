public class Pokemon{
	double health;
	private int atk;
	private int spatk;
	private int def;
	private int spdef;
	private int speed;
	public int type;
	public Pokemon(double a, int b, int c, int d, int e, int f, int g) {
		health = a;
		atk = b;
		spatk = c;
		def = d;
		spdef = e;
		speed = f;
		type = g;
	}
	public void atk(Pokemon b, int a, double ii, double r){
		if(a == 1){
			b.gotHit((b.getHealth() - ((11/25)*(atk/b.getDef()) + 2)*ii*r));
		}
		else if(a == 2){
				b.gotHit((b.getHealth() - ((11/25)*(spatk/b.getSpDef()) + 2)*ii*r));
		}
	}
	public double getHealth(){
		return health;
	}
	public void gotHit(double h){
		health = h;
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
