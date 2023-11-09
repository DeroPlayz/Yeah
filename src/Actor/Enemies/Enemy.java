package src.Actor.Enemies;

import java.util.ArrayList;

import src.Elements.Skill;

/**
    The superclass used to define enemies in the game.
    @param Name - The name of the demon.
    @param Arcana - The Arcana of the demon.
    @param MaxHP - The max damage the demon can take before dying.
    @param HP - The current health value of the demon.
    @param MaxSP - The max spirit point stat of the demon.
    @param SP - The current spirit point value of the demon.
    @param Attack - The physical attack stat for the demon.
    @param Magic - The magical attack stat for the demon.
    @param Defense - How much damage the demon takes.
    @param Agility - Dictates the move priority and hit/dodge rate.
    */
public class Enemy{
    //Data
    public String Name;
    public Arcana Arcana = Arcana.Dummy;
    public double Level;
    public int MaxHP;
    public int HP;
    public int MaxSP;
    public int SP;
    public int Attack;
    public int Magic;
    public int Defense;
    public int Agility;
    public double[] Affinities = new double[6];
    public ArrayList<Skill> skillPool;
    public AI AI;

    // public Enemy(String Name, Arcana Arcana, double Level, int MaxHP, int HP, int MaxSP, int SP, int Attack, int Magic, int Defense, int Agility, double[] Affinities, ArrayList<Skill> skillPool){

    // }

    //Resistances
    public final static double weak = 1.5; //Weak
    public final static double normal = 1.0; //No affinity
    public final static double resist = 0.5; //Resist
    public final static double block = 0.0; //Block
    public final static double absorb = -1.0; //Absorb

    /**
     * @param Fire Affinity.<br>
     * @param Ice Affinity.<br>
     * @param Electric Affinity.<br>
     * @param Wind Affinity.<br>
     * @param Light Affinity.<br>
     * @param Dark Affinity.
     */
    public void setAffinities(double Fire, double Ice, double Electric, double Wind, double Light, double Dark){
        Affinities[0] = Fire;
        Affinities[1] = Ice;
        Affinities[2] = Electric;
        Affinities[3] = Wind;
        Affinities[4] = Light;
        Affinities[5] = Dark;
    }

    public String AffinityStr(){
        String[] affs = {"Fire", "Ice", "Electric", "Wind", "Light", "Dark"};
        String s = "";
        for(int i = 0; i < Affinities.length; i++){
            if(Affinities[i] == weak){
                s += affs[i] + ": Weak\n";
            }
            else if(Affinities[i] == normal){
                s += affs[i] + ": Normal\n";
            }
            else if(Affinities[i] == resist){
                s += affs[i] + ": Resist\n";
            }
            else if(Affinities[i] == block){
                s += affs[i] + ": Block\n";
            }
            else if(Affinities[i] == absorb){
                s += affs[i] + ": Absorb\n";
            }
        }
        return s;
    }
    public String Stats(){
        String s = ("Name: " + Name + "\nArcana: " + Arcana + "\nLevel: " + ((int) Level) + "\nMax HP: " + HP + "\nMax SP:" + SP + "\nAttack: " + Attack + "\nMagic: " + Magic + "\nDefense: " + Defense + "\nAgility: " + Agility + "\n" + AffinityStr());
        return s;
    }

    public String toString(){
        String s = (Name + "\n" + Arcana + "\nLevel " + ((int) Level) + "\nHP: " + HP + "/" + MaxHP);
        return s;
    }

    public String Name() {
        return Name;
    }
    public double Level() {
        return Level;
    }
    public int MaxHP() {
        return MaxHP;
    }
    public int HP() {
        return HP;
    }
    public int MaxSP() {
        return MaxSP;
    }
    public int SP() {
        return SP;
    }
    public int Attack() {
        return Attack;
    }
    public int Magic() {
        return Magic;
    }
    public int Defense() {
        return Defense;
    }
    public int Agility() {
        return Agility;
    }
    public double[] Affinities() {
        return Affinities;
    }
    public ArrayList<Skill> SkillPool() {
        return skillPool;
    }
}