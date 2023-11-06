package Yeah.Enemies;

public class Pixie extends Enemy {

    public Pixie() {
        Name = "Pixie";
        Arcana = "Lovers";
        Level = 3;
        MaxHP = 17;
        HP = MaxHP;
        MaxSP = 14;
        SP = MaxSP;
        Attack = 1;
        Magic = 3;
        Defense = 5;
        Agility = 4;
        setAffinities(normal, weak, resist, resist, normal, resist, weak);
    }    
}