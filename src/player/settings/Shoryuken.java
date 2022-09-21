package player.settings;

public class Shoryuken extends Skills{
    public static String ownerofSkill = "Ryu";

    public int totem;

    public Shoryuken(int totem) {
        super(15,15,20);
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
