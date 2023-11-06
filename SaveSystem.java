package Yeah;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Yeah ChatGPT wrote this.

public class SaveSystem implements Serializable {
    static String save = "Save";

    public static void saveGame(){
        Player saveData = Main.player;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(save))) {
            //out.writeObject(saveData);
            out.writeObject(saveData.getName());
            out.writeObject(saveData.getSubject());
            out.writeObject(saveData.getObject());
            out.writeObject(saveData.getLevel());
            out.writeObject(saveData.getXP());
            out.writeObject(saveData.getMaxHP());
            out.writeObject(saveData.getHP());
            out.writeObject(saveData.getMaxSP());
            out.writeObject(saveData.getSP());
            out.writeObject(saveData.getAttack());
            out.writeObject(saveData.getMagic());
            out.writeObject(saveData.getDefense());
            out.writeObject(saveData.getAgility());
            out.writeObject(saveData.getAffinities());
            out.writeObject(saveData.getStatPoints());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Player loadGame() {
        Player saveData = new Player();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(save))) {
            saveData.Name = (String) in.readObject();
            saveData.Subject = (String) in.readObject();
            saveData.Object = (String) in.readObject();
            saveData.Level = (int) in.readObject();
            saveData.XP = (int) in.readObject();
            saveData.MaxHP = (int) in.readObject();
            saveData.HP = (int) in.readObject();
            saveData.MaxSP = (int) in.readObject();
            saveData.SP = (int) in.readObject();
            saveData.Attack = (int) in.readObject();
            saveData.Magic = (int) in.readObject();
            saveData.Defense = (int) in.readObject();
            saveData.Agility = (int) in.readObject();
            saveData.Affinities = (double[]) in.readObject();
            saveData.statPoints = (int) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return saveData;
    }
}