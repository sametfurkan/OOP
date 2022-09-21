package player.settings;

public class Hadouken extends Skills {
    public static String ownerofSkill = "Ryu";
    public int totem;
    public Hadouken(int totem){
        super(20,10,30);
        this.totem = totem;
    }

    public static String getOwnerofSkill() {
        return ownerofSkill;
    }

    public int getTotem() {
        return totem;
    }

    public static void setOwnerofSkill(String ownerofSkill) {
        Hadouken.ownerofSkill = ownerofSkill;
    }

    public void setTotem(int totem) {
        this.totem = totem;
    }
}
