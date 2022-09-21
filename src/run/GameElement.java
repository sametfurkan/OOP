package run;

public class GameElement {

    private int health;

    public GameElement(){
    setHealth(Game.FULL_HEALTH);

    }

    private void setHealth(int health) { // 100 den fazla can değeri atanmaya çalışıldığında bu exception
        if(health> Game.FULL_HEALTH)                                                                 // fırlatılacaktır.
            throw new IllegalArgumentException("Sağlık yüzden küçük olmalıdır ! ");
        this.health = health;
    }

    public int getHealth() {  // health değişkenine erişim için kullanılan getter metodu.
        return health;
    }

    public void resetHealth(){
        health = Game.FULL_HEALTH;
    }

    public void decreaseHealth(int points){
        health = health - points;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
