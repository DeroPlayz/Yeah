package src.Actor.Enemies;

import src.Elements.Skill;

public class JackFrost extends Enemy {
    public JackFrost() {
        super.Name = "Jack Frost";
        super.Arcana = Arcana.Magician;
        super.Level = 11;
        super.MaxHP = 214;
        super.HP = MaxHP;
        super.MaxSP = 129;
        super.SP = MaxSP;
        super.Attack = 12;
        super.Magic = 22;
        super.Defense = 11;
        super.Agility = 13;
        super.skillPool.set(0, Skill.Bufu);
        super.skillPool.set(1, Skill.Mabufu);
        super.skillPool.set(2, Skill.Dia);
    }
    
}