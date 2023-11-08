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
    public static Element Element;
    public static int Single = 0;
    public static int All = 1;
    public static int Random = 2;
    public static int Ally = 0;
    public static final int Enemy = 1;
    public static

    public Skill(Element Element, int HitType, int Targets){
        Skill.Element = Element;
    }

    //Fire Skills
    public static Element Agi;
    public static Element Agilao;
    public static Element Agidyne;
    public static Element Maragi;
    public static Element Maragion;
    public static Element Maragidyne;
    
    //Ice Skills
    public static Element Bufu;
    public static Element Bufula;
    public static Element Bufudyne;
    public static Element Mabufu;
    public static Element Mabufula;
    public static Element Mabufudyne;

    //Electric Skills
    public static Element Zio;
    public static Element Zionga;
    public static Element Ziodyne;
    public static Element Mazio;
    public static Element Mazionga;
    public static Element Maziodyne;

    //Wind Skills
    public static Element Garu;
    public static Element Garula;
    public static Element Garudyne;
    public static Element Magaru;
    public static Element Magarula;
    public static Element Magarudyne;

    //Light Skills
    public static Element Kouha;
    public static Element Kouga;
    public static Element Kougaon;
    public static Element Makouha;
    public static Element Makouga;
    public static Element Makougaon;

    //Dark Skills
    public static Element Eiha;
    public static Element Eiga;
    public static Element Eigaon;
    public static Element Maeiha;
    public static Element Maeiga;
    public static Element Maeigaon;

    public static void fireSkills(){
        Agi = new Skill(Fire, Single, Enemy);
        Agilao = new Skill()
    }
    public static void getSkills(){
        getFireSkills();
    }
}
