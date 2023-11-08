package src.Elements.Skills;

import static src.Elements.ElemList.Physical;
import static src.Elements.ElemList.Fire;
import static src.Elements.ElemList.Ice;
import static src.Elements.ElemList.Electric;
import static src.Elements.ElemList.Wind;
import static src.Elements.ElemList.Light;
import static src.Elements.ElemList.Dark;

import src.Elements.Element;

public class Skill {
    //Actual Properties
    public String Name;
    public Element Element;
    public int Strength;
    public int HitType;
    public int Targets;
    
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

    public Element Element(){
        return Element;
    }

    public int HitType(){
        return HitType;
    }

    public int Targets(){
        return Targets;
    }

    //Physical Skills
    public static Skill Bash = new Skill("Placeholder so java doesn't remind me about the unused phys import", Physical, Weak, Single);

    //Fire Skills
    public static Skill Agi;
    public static Skill Agilao;
    public static Skill Agidyne;
    public static Skill Agibarion;

    public static Skill Maragi;
    public static Skill Maragion;
    public static Skill Maragidyne;
    public static Skill Maragibarion;

    //Ice Skills
    public static Skill Bufu;
    public static Skill Bufula;
    public static Skill Bufudyne;
    public static Skill Bufubarion;

    public static Skill Mabufu;
    public static Skill Mabufula;
    public static Skill Mabufudyne;
    public static Skill Mabufubarion;

    //Electric Skills
    public static Skill Zio;
    public static Skill Zionga;
    public static Skill Ziodyne;
    public static Skill Ziobarion;

    public static Skill Mazio;
    public static Skill Mazionga;
    public static Skill Maziodyne;
    public static Skill Maziobarion;

    //Wind Skills
    public static Skill Garu;
    public static Skill Garula;
    public static Skill Garudyne;
    public static Skill Garubarion;

    public static Skill Magaru;
    public static Skill Magarula;
    public static Skill Magarudyne;
    public static Skill Magarubarion;
    
    //Light Skills
    public static Skill Kouha;
    public static Skill Kouga;
    public static Skill Kougaon;
    public static Skill Kouhabarion;
    
    public static Skill Makouha;
    public static Skill Makouga;
    public static Skill Makougaon;
    public static Skill Makouhabarion;

    //Dark Skills
    public static Skill Eiha;
    public static Skill Eiga;
    public static Skill Eigaon;
    public static Skill Eihabarion;
    
    public static Skill Maeiha;
    public static Skill Maeiga;
    public static Skill Maeigaon;
    public static Skill Maeihabarion;

    public static void fireSkills(){
        Agi = new Skill("Agi", Fire, Weak, Single);
        Agilao = new Skill("Agilao", Fire, Medium, Single);
        Agidyne = new Skill("Agidyne", Fire, Heavy ,Single);
        Agibarion = new Skill("Agibarion", Fire, Severe, Single);

        Maragi = new Skill("Maragi", Fire, Weak, Multi);
        Maragion = new Skill("Maragion", Fire, Medium, Multi);
        Maragidyne = new Skill("Maragidyne", Fire, Heavy, Multi);
        Maragibarion = new Skill("Maragibarion", Fire, Severe, Single);
    }

    public static void iceSkills(){
        Bufu = new Skill("Bufu", Ice, Weak, Single);
        Bufula = new Skill("Bufula", Ice, Medium, Single);
        Bufudyne = new Skill("Bufudyne", Ice, Heavy ,Single);
        Bufubarion = new Skill("Bufubarion", Ice, Severe, Single);
    
        Mabufu = new Skill("Mabufu", Ice, Weak, Multi);
        Mabufula = new Skill("Mabufu", Ice, Medium, Multi);
        Mabufudyne = new Skill("Mabufudyne", Ice, Heavy, Multi);
        Mabufubarion = new Skill("Mabufubarion", Ice, Severe, Single);
    }
    
    public static void electricSkills(){
    	Zio = new Skill("Zio", Electric, Weak, Single);
    	Zionga = new Skill("Zionga", Electric, Medium, Single);
    	Ziodyne = new Skill("Ziodyne", Electric, Heavy ,Single);
    	Ziobarion = new Skill("Ziobarion", Electric, Severe, Single);
   	 
    	Mazio = new Skill("Mazio", Electric, Weak, Multi);
    	Mazionga = new Skill("Mazionga", Electric, Medium, Multi);
    	Maziodyne = new Skill("Maziodyne", Electric, Heavy, Multi);
    	Maziobarion = new Skill("Maziobarion", Electric, Severe, Single);
	}

    public static void windSkills(){
    	Garu = new Skill("Garu", Wind, Weak, Single);
    	Garula = new Skill("Garula", Wind, Medium, Single);
    	Garudyne = new Skill("Garudyne", Wind, Heavy ,Single);
    	Garubarion = new Skill("Garubarion", Wind, Severe, Single);
   	 
    	Magaru = new Skill("Magaru", Wind, Weak, Multi);
    	Magarula = new Skill("Magarula", Wind, Medium, Multi);
    	Magarudyne = new Skill("Magarudyne", Wind, Heavy, Multi);
    	Magarubarion = new Skill("Magarubarion", Wind, Severe, Single);
	}

    public static void lightSkills(){
    	Kouha = new Skill("Kouha", Light, Weak, Single);
    	Kouga = new Skill("Kouga", Light, Medium, Single);
    	Kougaon = new Skill("Kougaon", Light, Heavy ,Single);
    	Kouhabarion = new Skill("Kouhabarion", Light, Severe, Single);
   	 
    	Makouha = new Skill("Makouha", Light, Weak, Multi);
    	Makouga = new Skill("Makouga", Light, Medium, Multi);
    	Makougaon = new Skill("Makougaon", Light, Heavy, Multi);
    	Makouhabarion = new Skill("Makouhabarion", Light, Severe, Single);
	}

    public static void darkSkills(){
    	Eiha = new Skill("Eiha", Dark, Weak, Single);
    	Eiga = new Skill("Eiga", Dark, Medium, Single);
    	Eigaon = new Skill("Eigaon", Dark, Heavy ,Single);
    	Eihabarion = new Skill("Eihabarion", Dark, Severe, Single);
   	 
    	Maeiha = new Skill("Maeiha", Dark, Weak, Multi);
    	Maeiga = new Skill("Maeiga", Dark, Medium, Multi);
    	Maeigaon = new Skill("Maeigaon", Dark, Heavy, Multi);
    	Maeihabarion = new Skill("Maeihabarion", Dark, Severe, Single);
	}

    public static void Skills(){
        fireSkills();
        iceSkills();
        electricSkills();
        windSkills();
        lightSkills();
        darkSkills();
    }
}
