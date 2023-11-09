package src.Actor;

import java.io.Serializable;

import src.Actor.Enemies.Enemy;
import src.Elements.Skill;

public class Player implements Serializable{
    public String Name = "Dummy";
    public String Subject = "They";
    public String Object = "They";
    //public String Arcana = "Fool";
    public int Level = 1;
    public int XP = 0;
    public int TNL = (int) Math.pow(Level-1, (Level/5)) + 50; // XP To Next Level
    public int MaxHP = 25;
    public int HP = MaxHP;
    public int MaxSP = 15;
    public int SP = MaxSP;
    public int Attack = 1;
    public int Magic = 1;
    public int Defense = 1;
    public int Agility = 1;
    public double[] Affinities = new double[7];
    public int statPoints = 6;
    
    public Player(){
        this.Name = "Dummy"; 
        this.Subject = "they";
        this.Object = "them";
        this.Level = 0;
        this.MaxHP = this.HP = this.MaxSP = this.SP = this.Attack = this.Magic = this.Defense = this.Agility = this.statPoints = 0;
        this.Affinities = new double[7];
    }

    public Player(String Name, String Subject, String Object){
        this.Name = Name; //MafLib.askString("What's this hero's name?", true);
        this.Subject = Subject; //MafLib.askString("What's this hero's subject pronoun? (The \"he\" in he/him)", true).toLowerCase();
        this.Object = Object; //MafLib.askString("What's this hero's object pronoun? (The \"him\" in he/him)", true).toLowerCase();
    }

    public Player(String Name, String Subject, String Object, int Level, int XP, int MaxHP, int HP, int MaxSP, int SP, int Attack, int Magic, int Defense, int Agility, double[] Affinities, int statPoints){
        this.Name = Name;
        this.Subject = Subject;
        this.Object = Object;
        this.Level = Level;
        this.XP = XP;
        this.MaxHP = MaxHP;
        this.HP = HP;
        this.MaxSP = MaxSP;
        this.SP = SP;
        this.Attack = Attack;
        this.Magic = Magic;
        this.Defense = Defense;
        this.Agility = Agility;
        this.Affinities = Affinities;
        this.statPoints = statPoints;
    }

    public void hit(Enemy e, Skill s){
        int mult = (int) Affinities[s.ID()];
        int dmg = (s.Strength() * Magic) * mult;
        if(SP > s.Cost()){
            SP -= s.Cost();
            e.HP -= dmg;
        }

        System.out.println("Player Health:" + HP + "/" + MaxHP);
        System.out.println(e.Name() + " Health: "  + e.HP + "/" + e.MaxHP);
    }

    public String toString(){
        String s = "Hero: " + Name + " (" + Subject + "/" + Object + ")" + "\nLevel " + ((int) Level) + " (XP to Next Level: " + (TNL - XP) + ")\nHealth: " + HP + "/" + MaxHP + "\nSP: " + SP + "/" + MaxSP;
        return s;
    }

    public String getName() {
        return Name;
    }

    public String getSubject() {
        return Subject;
    }

    public String getObject() {
        return Object;
    }

    public int getLevel() {
        return Level;
    }

    public int getXP() {
        return XP;
    }

    public int getTNL() {
        return TNL;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public int getHP() {
        return HP;
    }

    public int getMaxSP() {
        return MaxSP;
    }

    public int getSP() {
        return SP;
    }

    public int getAttack() {
        return Attack;
    }

    public int getMagic() {
        return Magic;
    }

    public int getDefense() {
        return Defense;
    }

    public int getAgility() {
        return Agility;
    }

    public double[] getAffinities() {
        return Affinities;
    }

    public int getStatPoints() {
        return statPoints;
    }
}