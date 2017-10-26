public class WaterType extends Pokemon{
	double health;
	int atk;
	int spatk;
	int def;
	int spdef;
	int speed;
	public GrassType(double a, int b, int c, int d, int e, int f){
		health = a;
		atk = b;
		spatk = c;
		def = d;
		spdef = e;
		speed = f;
	}
	public double getHealth(){
		return health;
	}
	public int getAtk(){
		return atk;
	}
	public double getspAtk(){
		return spatk;
	}
	public double getDef(){
		return def;
	}
	public double getspDef(){
		return spdef;
	}
	public double getSpeed(){
		return speed;
	}
	public String toString(){
		return ("Health: " + health + "\nAttack: " + atk + "\nSpecial Attack: " + "\nDefense: " + def + "\nSpecial Defense: " + spdef + "\nSpeed: " + speed);
	}
	
}
