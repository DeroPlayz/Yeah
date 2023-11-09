package src;

import static src.SaveSystem.saveGame;
import static src.SaveSystem.loadGame;
import static src.Actor.Player.hit;
import java.nio.file.Files;
import java.nio.file.Paths;

import src.Actor.Actor;
import src.Actor.Player;
import src.Actor.Enemies.Enemy;
import src.Elements.Skill;

public class Main {
    static Player player;
    public static Enemy eOne;
    public static Enemy eTwo;
    public static Enemy eThree;
    public static Enemy eFour;
    public static Enemy eFive;
    public static Enemy eSix;
    
    public static void loadSave(String s){
        if(s.equals("l")){
            if(Files.exists(Paths.get(SaveSystem.save))){
                player = loadGame();
            }
            else{
                player = new Player(MafLib.askString("No save detected. Starting new save.\nWhat's this hero's name?", true), MafLib.askString("What's this hero's subject pronoun? (The \"he\" in he/him)", true).toLowerCase(), MafLib.askString("What's this hero's object pronoun? (The \"him\" in he/him)", true).toLowerCase());
            }
        }
        
        else if(s.equals("n")){
            player = new Player(MafLib.askString("What's this hero's name?", true), MafLib.askString("What's this hero's subject pronoun? (The \"he\" in he/him)", true).toLowerCase(), MafLib.askString("What's this hero's object pronoun? (The \"him\" in he/him)", true).toLowerCase());
        }

        while(player.XP >= player.TNL){
            int remainder = player.XP - player.TNL;
            player.Level += 1;
            player.XP = 0;
            player.XP += remainder;
            player.TNL = (int) Math.pow(player.Level-1, (player.Level/5)) + 50;
        }
    }

    public static void main(String[] args) {
        // window.setVisible(true);
        // window.setSize(1920, 1080);
        // window.setLayout(new FlowLayout());
        // window.add(buttonA);
        // window.add(buttonB);
        // window.add(buttonC);
        
        // buttonA.setVisible(true);
        // buttonB.setVisible(true);
        // buttonC.setVisible(true);
        
        loadSave(MafLib.askString("Would you like to load your save, or start a new one? (l/n)", true));
        saveGame(); 
        System.out.println(player);
        hit(eOne, Skill.Agi);
    }
    
    // public static void setEnemyParty(Enemy Enemy){
    //     eOne = Enemy;
    // }

    // public static void setEnemyParty(Enemy FirstEnemy, Enemy SecondEnemy){
    //     eOne = FirstEnemy;
    //     eTwo = SecondEnemy;
    // }

    // public static void setEnemyParty(Enemy FirstEnemy, Enemy SecondEnemy, Enemy ThirdEnemy){
    //     eOne = FirstEnemy;
    //     eTwo = SecondEnemy;
    //     eThree = ThirdEnemy;
    // }

    // public static void setEnemyParty(Enemy FirstEnemy, Enemy SecondEnemy, Enemy ThirdEnemy, Enemy FourthEnemy){
    //     eOne = FirstEnemy;
    //     eTwo = SecondEnemy;
    //     eThree = ThirdEnemy;
    //     eFour = FourthEnemy;
    // }

    // public static void setEnemyParty(Enemy FirstEnemy, Enemy SecondEnemy, Enemy ThirdEnemy, Enemy FourthEnemy, Enemy FifthEnemy){
    //     eOne = FirstEnemy;
    //     eTwo = SecondEnemy;
    //     eThree = ThirdEnemy;
    //     eFour = FourthEnemy;
    //     eFive = FifthEnemy;
    // }

    // public static void setEnemyParty(Enemy FirstEnemy, Enemy SecondEnemy, Enemy ThirdEnemy, Enemy FourthEnemy, Enemy FifthEnemy, Enemy SixthEnemy){
    //     eOne = FirstEnemy;
    //     eTwo = SecondEnemy;
    //     eThree = ThirdEnemy;
    //     eFour = FourthEnemy;
    //     eFive = FifthEnemy;
    //     eSix = SixthEnemy;
    // }
}
