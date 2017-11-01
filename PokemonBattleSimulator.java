import java.util.Random
import java.util.Scanner;
public class PokemonBattleSimulator{
        public static void main(String args[]) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please choose the first Pokemon type: If you want to choose a Grass type press 1, if you want to choose a Fire type press 2, if you want to choose a Water type press 3");
        FirstPokemonType = keyboard.nextInt();
        System.out.print("Please choose the second Pokemon type: If you want to choose a Grass type press 1, if you want to choose a Fire type press 2, if you want to choose a Water type press 3");
        SecondPokemonType = keyboard.nextInt();
        double advantage = 0;
        if(FirstPokemonType == SecondPokemonType){
                advantage = 1.0;
        }
        if((FirstPokemonType == 1 && SecondPokemonType == 3)||(FirstPokemonType == 2 && SecondPokemonType == 1) || (FirstPokemonType == 3 && SecondPokemonType == 2)){
                advantage = 2.0;
        }
        if((FirstPokemonType == 3 && SecondPokemonType == 1)||(FirstPokemonType == 1 && SecondPokemonType == 2) || (FirstPokemonType == 2 && SecondPokemonType == 3))
                advantage = .5;
        }
        System.out.println("Please enter the stats of your first pokemon: ");
        Pokemon ababa = new Pokemon(keyboard.nextDouble(), keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),FirstPokemonType);
        System.out.println("Please enter the stats of your second pokemon: ");
        Pokemon cdcdc = new Pokemon(keyboard.nextDouble(), keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),SecondPokemonType);
              
        while(ababa.getHealth() > 0 && cdcdc.getHealth() > 0){
                vary = random.nextDouble();
                System.out.println("Choose your next action for Pokemon 1. Press 1 to attack or 2 to special attack:");
                nextAction1 = keyboard.nextInt();
                System.out.println("Choose your next action for Pokemon 1. Press 1 to attack or 2 to special attack:");
                nextAction2 = keyboard.nextInt();
                if(ababa.getSpeed() > cdcdc.getSpeed()){
                        ababa.atk(cdcdc,nextAction1,advantage,vary);
                        if(cdcdc.getHealth() < 0){
                             break;
                        }
                        cdcdc.atk(ababa,nextAction2,1/advantage,vary);                                                               
                }
                else if(ababa.getSpeed() < cdcdc.getSpeed()){
                        cdcdc.atk(ababa,nextAction2,1/advantage,vary);
                        if(ababa.getHealth() < 0){
                                break;
                        }
                        ababa.atk(cdcdc,nextAction1,advantage,vary);
                }
        }
        if(ababa.getHealth < 0){
                System.out.println("Pokemon 1 loses!");
        }
        else{
                System.out.println("Pokemon 2 loses!");
        }
                     
                
               

