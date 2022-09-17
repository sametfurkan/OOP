package run;

import java.util.Scanner;

public class Player {

    private String character;    // main metodunda kullanılan bu değişkenler private olarak tanımlanıp
    private int health;     // encapsule edilmiştir. Bu sayede bu değişkenlere direkt erişim engellenmiş
    private String skills; // ve getter ve setter metodları sayesinde değişiklik yapılmasına olanak sağlanmıştır.
    private String nickname;
    private int age;





    public Player(String character, int health, String skills, String nickname,int age ){ // constructer, değişkenleri parametre olarak alır ve
        setCharacter(character);                                     // set edebilmemize olanak sağlar.
        setHealth(health);
        setSkills(skills);
        setNickname(nickname);
        setAge(age);
    }
    public Player(String character, int health){ // skills değişkeni main metodu akışında aktif kullanılmadığından
        setCharacter(character);                      // diğer iki parametreyi alan constructer ile de çağırılabilecek
        setHealth(health);                  // şekilde kurgulanmıştır.
        setNickname(nickname);
        setAge(age);
    }

    /*    SETTERS    */
    private void setCharacter(String character) {  // name değişkeninin değerini değiştirmek için kullandığımız
        this.character = character;                // setter metoddur. run.Player classı içerisindeki run.Player constructor'u
    }                                    // içerisinde çağırıldığı için private acces modifieri kullanılmıştır.

    private void setHealth(int health) { // 100 den fazla can değeri atanmaya çalışıldığında bu exception
        if(health>100)                                                                 // fırlatılacaktır.
            throw new IllegalArgumentException("Sağlık yüzden küçük olmalıdır ! ");
        this.health = health;
    }

    private void setSkills(String skills) {
        this.skills = skills;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        if(age<8)
            throw new IllegalArgumentException("Yaşınız sekizden büyük olmalıdır !");
        this.age = age;
    }

    /*    GETTERS    */
    public String getCharacter() {  // name değişkenine erişim için kullanılan getter metodu.
        return character;
    }

    public int getHealth() {  // health değişkenine erişim için kullanılan getter metodu.
        return health;
    }

    public String getSkills() { // health değişkenine erişim için kullanılan getter metodu.
        return skills;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void resetHealth(){
        health = 100;
    }

    public void decreaseHealth(int points){
        health = health - points;
    }

    public String askNickname(){
        System.out.println("Kullanıcıadınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int askAge(){
        System.out.println("Yaşınızı Giriniz:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean isAlive(){
        return health > 0;
    }
}
