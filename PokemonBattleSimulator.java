// Andrew Lee and Anjali Sardana
// 11/1/17
//Period 5
import java.util.Random; // importing random and scanner
import java.util.Scanner;
public class PokemonBattleSimulator{
        public static void main(String args[]) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please choose the first Pokemon type: \nIf you want to choose a Grass type press 1 \nif you want to choose a Fire type press 2 \nif you want to choose a Water type press 3");
        int FirstPokemonType = keyboard.nextInt(); // chooses type of Pokemon
        System.out.print("Please choose the second Pokemon type: If you want to choose a Grass type press 1 \nif you want to choose a Fire type press 2 \nif you want to choose a Water type press 3");
        int SecondPokemonType = keyboard.nextInt();
        double advantage = 0;
        if(FirstPokemonType == SecondPokemonType){ // type advantage calculation
               advantage = 1.0;
        }
        if((FirstPokemonType == 1 && SecondPokemonType == 3)||(FirstPokemonType == 2 && SecondPokemonType == 1) || (FirstPokemonType == 3 && SecondPokemonType == 2)){
               advantage = 2.0;
        }
        if((FirstPokemonType == 3 && SecondPokemonType == 1)||(FirstPokemonType == 1 && SecondPokemonType == 2) || (FirstPokemonType == 2 && SecondPokemonType == 3)){
               advantage = .5;
        }
        System.out.println("Please enter the stats of your first pokemon: "); // enter Pokemon stats
        Pokemon ababa = new Pokemon(keyboard.nextDouble(), keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),FirstPokemonType);
        System.out.println("Please enter the stats of your second pokemon: ");
        Pokemon cdcdc = new Pokemon(keyboard.nextDouble(), keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),SecondPokemonType);
              
        while(ababa.getHealth() > 0 && cdcdc.getHealth() > 0){ // turns for attacking, the actual battle
                double vary = random.nextDouble()*.15+.85;
                System.out.println("Choose your next action for Pokemon 1. Press 1 to attack or 2 to special attack:");
                int nextAction1 = keyboard.nextInt();
                System.out.println("Choose your next action for Pokemon 2. Press 1 to attack or 2 to special attack:");
                int nextAction2 = keyboard.nextInt();
                if(ababa.getSpeed() > cdcdc.getSpeed()){
                	System.out.println("Pokemon 1 Attacks!");
                        ababa.atk(cdcdc,nextAction1,advantage,vary);
                        System.out.println("Pokemon 2's health is now: " + cdcdc.getHealth());
                        if(cdcdc.getHealth() < 0){
                             break;
                        }
                        System.out.println("Pokemon 2 Attacks!");
                        cdcdc.atk(ababa,nextAction2,1/advantage,vary);     
                        System.out.println("Pokemon 1's health is now: " + ababa.getHealth());
                }
                else if(ababa.getSpeed() < cdcdc.getSpeed()){
                	System.out.println("Pokemon 2 Attacks!");
                        cdcdc.atk(ababa,nextAction2,1/advantage,vary);
                        System.out.println("Pokemon 1's health is now: " + ababa.getHealth());
                        if(ababa.getHealth() < 0){
                                break;
                        }
                        System.out.println("Pokemon 1 Attacks!");
                        ababa.atk(cdcdc,nextAction1,advantage,vary);
                        System.out.println("Pokemon 2's health is now: " + cdcdc.getHealth());
                }
        }
        if(ababa.getHealth() < 0){ // prints who loses
                System.out.println("Pokemon 1 loses!");
        }
        else{
                System.out.println("Pokemon 2 loses!");
        }
}
}
