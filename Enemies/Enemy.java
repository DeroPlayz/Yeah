package Yeah.Enemies;

/**
The superclass used to define enemies in the game.
*/

public abstract class Enemy {
    public static String Name;
    public static String Arcana;
    public static double Level;
    public static int MaxHP;
    public static int HP;
    public static int MaxSP;
    public static int SP;
    public static int Attack;
    public static int Magic;
    public static int Defense;
    public static int Agility;
    public static double[] Affinities = new double[7];
    //Resistances
    public static double weak = 1.5; //Weak
    public static double normal = 1.0; //No affinity
    public static double resist = 0.5; //Resist
    public static double block = 0.0; //Block
    public static double absorb = -1.0; //Absorb

    /**
     * @param Physical Affinity.<br>
     * @param Fire Affinity.<br>
     * @param Ice Affinity.<br>
     * @param Electric Affinity.<br>
     * @param Wind Affinity.<br>
     * @param Light Affinity.<br>
     * @param Dark Affinity.
     */
    public static void setAffinities(double Physical, double Fire, double Ice, double Electric, double Wind, double Light, double Dark){
        Affinities[0] = Physical;
        Affinities[1] = Fire;
        Affinities[2] = Ice;
        Affinities[3] = Electric;
        Affinities[4] = Wind;
        Affinities[5] = Light;
        Affinities[6] = Dark;
    }
    // public static String getName() {return Name;}; //public static void setName(String Name) {Enemy.Name = Name;}
    // public static String getArcana() {return Arcana;}; //public static void setArcana(String Arcana) {Enemy.Arcana = Arcana;}
    // public static int getHP() {return HP;}; //public static void setHP(int HP) {Enemy.HP = HP;}
    // public static int getSP() {return SP;}; //public static void setSP(int SP) {Enemy.SP = SP;}
    // public static int getAttack() {return Attack;}; //public static void setAttack(int Attack) {Enemy.Attack = Attack;}
    // public static int getMagic() {return Magic;}; //public static void setMagic(int Magic) {Enemy.Magic = Magic;}
    // public static int getDefense() {return Defense;}; //public static void setDefense(int Defense) {Enemy.Defense = Defense;}
    // public static int getAgility() {return Agility;}; //public static void setAgility(int Agility) {Enemy.Agility = Agility;}
    // public static int[] getAffinities() {return Affinities;}; //public static void SetAffinitiea

    public String AffinityStr(){
        String[] affs = {"Physical", "Fire", "Ice", "Electric", "Wind", "Light", "Dark"};
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
        String s = ("Name: " + Enemy.Name + "\nArcana: " + Enemy.Arcana + "\nLevel: " + ((int) Enemy.Level) + "\nMax HP: " + Enemy.HP + "\nMax SP:" + Enemy.SP + "\nAttack: " + Enemy.Attack + "\nMagic: " + Enemy.Magic + "\nDefense: " + Enemy.Defense + "\nAgility: " + Enemy.Agility + "\n" + AffinityStr());
        return s;
    }

    public String toString(){
        String s = (Enemy.Name + "\n" + Enemy.Arcana + "\nLevel " + ((int) Enemy.Level) + "\nHP: " + Enemy.HP + "/" + Enemy.MaxHP);
        return s;
    }
}

/**
    The superclass used to define enemies in the game.
    @param Name - The name of the demon.
    @param Arcana - The Arcana of the demon. Affects summoning and reaction to certain spells.
    @param MaxHP - The max damage the demon can take before dying.
    @param HP - The current health value of the demon.
    @param MaxSP - The max spirit point stat of the demon.
    @param SP - The current spirit point value of the demon.
    @param Attack - The physical attack stat for the demon.
    @param Magic - The magical attack stat for the demon.
    @param Defense - How much damage the demon takes.
    @param Agility - Dictates the move priority and hit/dodge rate.
    */