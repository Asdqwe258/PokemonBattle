import java.util.Random;
public class Pokemon {

	public void atk(Pokemon a, Pokemon b){
		= b.getHealth() - (11/25)*(a.getAtk()/b.getDef()) + 2
	}
	public void spAtk(Pokemon a,Pokemon b){
		= b.getHealth() - (11/25)*(a.getSpAtk()/b.getSpDef()) + 2

	}
}
