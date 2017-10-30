public class Pokemon{
	double health;
	int atk;
	int spatk;
	int def;
	int spdef;
	int speed;
	public Pokemon(double a, int b, int c, int d, int e, int f) {
		health = a;
		atk = b;
		spatk = c;
		def = d;
		spdef = e;
		speed = f;
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
	public String toString(){
		return ("Health: " + health + "\nAttack: " + atk + "\nSpecial Attack: " + "\nDefense: " + def + "\nSpecial Defense: " + spdef + "\nSpeed: " + speed);
	}
	
}
