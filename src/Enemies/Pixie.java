package src.Enemies;

public class Pixie extends Enemy {

    public Pixie() {
        Name = "Pixie";
        Arcana = "Lovers";
        Level = 2;
        MaxHP = 86;
        HP = MaxHP;
        MaxSP = 14;
        SP = MaxSP;
        Attack = 1;
        Magic = 3;
        Defense = 3;
        Agility = 4;
        setAffinities(normal, weak, resist, resist, normal, resist, weak);
    }    
}