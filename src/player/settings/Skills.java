package player.settings;

public class Skills{

    private int damage;
    private int speed;
    private int period;

    public Skills(int damage, int speed, int period){
        setDamage(damage);
        setSpeed(speed);
        setPeriod(period);
    }

    public int getDamage() {return damage;}

    public int getSpeed() {return speed;}

    public int getPeriod() {return period;}

    public void setDamage(int damage) {this.damage = damage;}

    public void setSpeed(int speed) {this.speed = speed;}

    public void setPeriod(int period) {this.period = period;}
}
