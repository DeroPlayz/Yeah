package src.Elements;

import static src.Elements.ElemList.*;

public class Skill {
    //Actual Properties
    private String Name;
    private Element Element;
    private int Strength;
    private int HitType;
    private int Targets;
    
    //Strength Levels
    public static final int Weak = 3;
    public static final int Medium = 6;
    public static final int Heavy = 9;
    public static final int Severe = 15;
    public static final int Colossal = 18;

    //Selection Type (Who within its' target type it'll affect.)
    public static final int Single = 0;
    public static final int Multi = 1;
    public static final int Random = 2;
    
    //Target Type
    public static final int Ally = 0;
    public static final int Enemy = 1;
    public static final int Everyone = 2;

    public Skill(String Name, Element Element, int Strength, int HitType){
        this.Name = Name;
        this.Element = Element;
        this.Strength = Strength;
        this.HitType = HitType;
        this.Targets = Enemy;
    }

    public Skill(String Name, Element Element, int Strength, int HitType, int Targets){
        this.Name = Name;
        this.Element = Element;
        this.Strength = Strength;
        this.HitType = HitType;
        this.Targets = Targets;
    }

    public String toString(){
        return Name;
    }

    public Element Element(){
        return Element;
    }

    public int Strength(){
        return Strength;
    }

    public int HitType(){
        return HitType;
    }

    public int Targets(){
        return Targets;
    }

    //Physical Skills
    public static Skill Bash = new Skill("Placeholder so java doesn't remind me about the unused phys import", Physical, Weak, Single);

    public static Skill Agi = new Skill("Agi", Fire, Weak, Single);
    public static Skill Agilao = new Skill("Agilao", Fire, Medium, Single);
    public static Skill Agidyne = new Skill("Agidyne", Fire, Heavy ,Single);
    public static Skill Agibarion = new Skill("Agibarion", Fire, Severe, Single);

    public static Skill Maragi = new Skill("Maragi", Fire, Weak, Multi);
    public static Skill Maragion = new Skill("Maragion", Fire, Medium, Multi);
    public static Skill Maragidyne = new Skill("Maragidyne", Fire, Heavy, Multi);
    public static Skill Maragibarion = new Skill("Maragibarion", Fire, Severe, Single);


    public static Skill Bufu = new Skill("Bufu", Ice, Weak, Single);
    public static Skill Bufula = new Skill("Bufula", Ice, Medium, Single);
    public static Skill Bufudyne = new Skill("Bufudyne", Ice, Heavy ,Single);
    public static Skill Bufubarion = new Skill("Bufubarion", Ice, Severe, Single);

    public static Skill Mabufu = new Skill("Mabufu", Ice, Weak, Multi);
    public static Skill Mabufula = new Skill("Mabufu", Ice, Medium, Multi);
    public static Skill Mabufudyne = new Skill("Mabufudyne", Ice, Heavy, Multi);
    public static Skill Mabufubarion = new Skill("Mabufubarion", Ice, Severe, Single);


    public static Skill Zio = new Skill("Zio", Electric, Weak, Single);
    public static Skill Zionga = new Skill("Zionga", Electric, Medium, Single);
    public static Skill Ziodyne = new Skill("Ziodyne", Electric, Heavy ,Single);
    public static Skill Ziobarion = new Skill("Ziobarion", Electric, Severe, Single);
    
    public static Skill Mazio = new Skill("Mazio", Electric, Weak, Multi);
    public static Skill Mazionga = new Skill("Mazionga", Electric, Medium, Multi);
    public static Skill Maziodyne = new Skill("Maziodyne", Electric, Heavy, Multi);
    public static Skill Maziobarion = new Skill("Maziobarion", Electric, Severe, Single);


    public static Skill Garu = new Skill("Garu", Wind, Weak, Single);
    public static Skill Garula = new Skill("Garula", Wind, Medium, Single);
    public static Skill Garudyne = new Skill("Garudyne", Wind, Heavy ,Single);
    public static Skill Garubarion = new Skill("Garubarion", Wind, Severe, Single);
    
    public static Skill Magaru = new Skill("Magaru", Wind, Weak, Multi);
    public static Skill Magarula = new Skill("Magarula", Wind, Medium, Multi);
    public static Skill Magarudyne = new Skill("Magarudyne", Wind, Heavy, Multi);
    public static Skill Magarubarion = new Skill("Magarubarion", Wind, Severe, Single);


    public static Skill Kouha = new Skill("Kouha", Light, Weak, Single);
    public static Skill Kouga = new Skill("Kouga", Light, Medium, Single);
    public static Skill Kougaon = new Skill("Kougaon", Light, Heavy ,Single);
    public static Skill Kouhabarion = new Skill("Kouhabarion", Light, Severe, Single);
    
    public static Skill Makouha = new Skill("Makouha", Light, Weak, Multi);
    public static Skill Makouga = new Skill("Makouga", Light, Medium, Multi);
    public static Skill Makougaon = new Skill("Makougaon", Light, Heavy, Multi);
    public static Skill Makouhabarion = new Skill("Makouhabarion", Light, Severe, Single);


    public static Skill Eiha = new Skill("Eiha", Dark, Weak, Single);
    public static Skill Eiga = new Skill("Eiga", Dark, Medium, Single);
    public static Skill Eigaon = new Skill("Eigaon", Dark, Heavy ,Single);
    public static Skill Eihabarion = new Skill("Eihabarion", Dark, Severe, Single);
    
    public static Skill Maeiha = new Skill("Maeiha", Dark, Weak, Multi);
    public static Skill Maeiga = new Skill("Maeiga", Dark, Medium, Multi);
    public static Skill Maeigaon = new Skill("Maeigaon", Dark, Heavy, Multi);
    public static Skill Maeihabarion = new Skill("Maeihabarion", Dark, Severe, Single);

    public static Skill Dia = new Skill("Dia", Recovery, Weak, Single);
    public static Skill Diarama = new Skill("Diarama", Recovery, Medium, Single);
    public static Skill Diarahan = new Skill("Diarahan", Recovery, Heavy, Single);

    public static Skill Media = new Skill("Media", Recovery, Weak, Multi);
    public static Skill Mediarama = new Skill("Mediarama", Recovery, Medium, Multi);
    public static Skill Mediarahan = new Skill("Mediarahan", Recovery, Heavy, Multi);
}
