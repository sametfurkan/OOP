package player.settings;

public class TatsumakiSenpukyaku extends Skills{
    public static String ownerofSkill = "Ryu";

    public int totem;

    public TatsumakiSenpukyaku(int totem) {
        super(10,5,15);
        this.totem = totem;
    }

    public static String getOwnerofSkill() {
        return ownerofSkill;
    }

    public int getTotem() {
        return totem;
    }

    public static void setOwnerofSkill(String ownerofSkill) {
        TatsumakiSenpukyaku.ownerofSkill = ownerofSkill;
    }

    public void setTotem(int totem) {
        this.totem = totem;
    }
}
