package src;

import java.io.Serializable;

public class Player implements Serializable{
    public /*static*/ String Name = "Dummy";
    public /*static*/ String Subject = "They";
    public /*static*/ String Object = "They";
    //public /*static*/ String Arcana = "Fool";
    public /*static*/ int Level = 1;
    public /*static*/ int XP = 0;
    public /*static*/ int TNL = (int) Math.pow(Level-1, (Level/5)) + 50; // XP To Next Level
    public /*static*/ int MaxHP = 25;
    public /*static*/ int HP = MaxHP;
    public /*static*/ int MaxSP = 15;
    public /*static*/ int SP = MaxSP;
    public /*static*/ int Attack = 1;
    public /*static*/ int Magic = 1;
    public /*static*/ int Defense = 1;
    public /*static*/ int Agility = 1;
    public /*static*/ double[] Affinities = new double[7];
    public /*static*/ int statPoints = 6;
    
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

    public String toString(){
        String s = "Hero: " + Name + " (" + Subject + "/" + Object + ")" + "\nLevel " + ((int) Level) + " (XP to Next Level: " + (TNL - XP) + ")\nHealth: " + HP + "/" + MaxHP + "\nSP: " + SP + "/" + MaxSP;
        return s;
    }

    public /*static*/ String getName() {
        return Name;
    }

    public /*static*/ String getSubject() {
        return Subject;
    }

    public /*static*/ String getObject() {
        return Object;
    }

    public /*static*/ int getLevel() {
        return Level;
    }

    public /*static*/ int getXP() {
        return XP;
    }

    public /*static*/ int getTNL() {
        return TNL;
    }

    public /*static*/ int getMaxHP() {
        return MaxHP;
    }

    public /*static*/ int getHP() {
        return HP;
    }

    public /*static*/ int getMaxSP() {
        return MaxSP;
    }

    public /*static*/ int getSP() {
        return SP;
    }

    public /*static*/ int getAttack() {
        return Attack;
    }

    public /*static*/ int getMagic() {
        return Magic;
    }

    public /*static*/ int getDefense() {
        return Defense;
    }

    public /*static*/ int getAgility() {
        return Agility;
    }

    public /*static*/ double[] getAffinities() {
        return Affinities;
    }

    public /*static*/ int getStatPoints() {
        return statPoints;
    }
}