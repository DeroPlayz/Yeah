package src.Actor.Enemies;

import src.Elements.Skill;

public class JackFrost extends Enemy {
    public JackFrost() {
        Name = "Jack Frost";
        Arcana = Arcana.Magician;
        Level = 11;
        MaxHP = 214;
        HP = MaxHP;
        MaxSP = 129;
        SP = MaxSP;
        Attack = 12;
        Magic = 22;
        Defense = 11;
        Agility = 13;
        skillPool.set(0, Skill.Bufu);
        skillPool.set(1, Skill.Mabufu);
        skillPool.set(2, Skill.Dia);
    }
    
}