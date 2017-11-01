// Andrew Lee and Anjali Sardana
// 11/1/17
//Period 5
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
	public void atk(Pokemon b, int a, double ii, double r){ // attack methods, decreases health of other pokemon via the formulas
		if(a == 1){
			b.gotHit((b.getHealth() - ((11/25)*(atk/b.getDef()) + 2)*ii*r));
		}
		else if(a == 2){
				b.gotHit((b.getHealth() - ((11/25)*(spatk/b.getSpDef()) + 2)*ii*r));
		}
	}
	public double getHealth(){ // gets the health
		return health;
	}
	public void gotHit(double h){ // makes the pokemon lose health
		health = h;
	}
	public int getAtk(){//pokemon attacks
		return atk;
	}
	public int getSpAtk(){ // pokemon special attacks
		return spatk;
	}
	public int getDef(){ // pokemon defends
		return def;
	}
	public int getSpDef(){// pokemon special defends
		return spdef;
	}
	public int getSpeed(){// pokemons speed
		return speed;
	}
	public int getType(){ // gets the pokemon type to calculate advantage
		return type;
	}
	public String toString(){ // prints stats
		return ("Health: " + health + "\nAttack: " + atk + "\nSpecial Attack: " + "\nDefense: " + def + "\nSpecial Defense: " + spdef + "\nSpeed: " + speed);
	}
	
}
