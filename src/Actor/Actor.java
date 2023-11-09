package src.Actor;

import java.util.ArrayList;

import src.Elements.Skill;

public class Actor {
    public String Name;
    public double Level;
    public int MaxHP;
    public int HP;
    public int MaxSP;
    public int SP;
    public int Attack;
    public int Magic;
    public int Defense;
    public int Agility;
    public double[] Affinities = new double[7];
    public ArrayList<Skill> skillPool;
    
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
